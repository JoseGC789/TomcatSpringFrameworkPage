package com.apishow.dao;

import com.apishow.entities.PersonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public class HibernateH2PersonDao implements PersonDao{
    private final SessionFactory sessionFactory;

    public HibernateH2PersonDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public PersonEntity create(String name){
        PersonEntity person = new PersonEntity();
        person.setName(name);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
        return person;
    }

    @Override
    public List<PersonEntity> findAll(String find){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from PersonEntity order by id DESC");
        List resultList = query.getResultList();
        session.close();
        return resultList;
    }
}
