package com.apishow.service;

import com.apishow.dao.PersonDao;
import com.apishow.entities.PersonEntity;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class ContentService implements ManagedContent{
    private final PersonEntity defaultPerson;
    private final PersonDao dao;

    public ContentService(String message, PersonDao dao){
        this.defaultPerson = new PersonEntity(null, message);
        this.dao = dao;
    }

    public String readAll(){
        StringBuilder builder = new StringBuilder();
        dao.findAll().forEach(personEntity -> builder.append(personEntity.getName()).append(" "));
        return builder.toString();
    }

    public PersonEntity write(PersonEntity person){
        return dao.create(person.getName() == null ? defaultPerson : person);
    }

    @Override
    public void setMessage(String msg){
        log.info("Message set to: " + msg);
        this.defaultPerson.setName(msg);
    }

    @Override
    public void writeToDao(){
        log.info("Written to dao: " + defaultPerson.toString());
        dao.create(defaultPerson);
    }

    @Override
    public void writeToDao(String msg){
        defaultPerson.setName(msg);
        log.info("Written to dao: " + defaultPerson.toString());
        dao.create(defaultPerson);
    }

    @Override
    public String getMessage(){
        log.info("Current message: " + defaultPerson.toString());
        return defaultPerson.toString();
    }
}
