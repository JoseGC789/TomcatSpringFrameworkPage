package com.apishow.service;

import com.apishow.dao.PersonDao;
import com.apishow.entities.PersonEntity;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class ContentService implements ManagedContent{
    private String message;
    private final PersonDao dao;

    public ContentService(String message, PersonDao dao){
        this.message = message;
        this.dao = dao;
    }

    public String readAll(){
        StringBuilder builder = new StringBuilder();
        dao.findAll(message).forEach(personEntity -> builder.append(personEntity.getName()).append(" "));
        return builder.toString();
    }

    public PersonEntity write(){
        return dao.create(message);
    }

    @Override
    public void setMessage(String msg){
        log.info("Message set to: " + msg);
        this.message = msg;
    }

    @Override
    public void writeToDao(){
        log.info("Written to dao: " + message);
        dao.create(message);
    }

    @Override
    public void writeToDao(String msg){
        log.info("Written to dao: " + msg);
        dao.create(msg);
    }

    @Override
    public String getMessage(){
        log.info("Current message: " + message);
        return message;
    }
}
