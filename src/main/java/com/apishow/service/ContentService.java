package com.apishow.service;

import com.apishow.dao.PersonDao;
import com.apishow.entities.PersonEntity;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.util.StringUtils;

@CommonsLog
public class ContentService implements ManagedContent{
    private final PersonEntity defaultPerson;
    private final PersonDao dao;

    public ContentService(PersonEntity defaultPerson, PersonDao dao){
        this.defaultPerson = defaultPerson;
        this.dao = dao;
    }

    public String readAll(){
        StringBuilder builder = new StringBuilder();
        dao.findAll().forEach(personEntity -> builder.append(personEntity.getName()).append(" "));
        return builder.toString();
    }

    public PersonEntity write(PersonEntity person){
        if(StringUtils.isEmpty(person.getName())){
            person.setName(defaultPerson.getName());
            return dao.create(person);
        }else{
            return dao.create(person);
        }
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
