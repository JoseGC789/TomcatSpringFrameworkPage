package com.apishow.service;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class ContentService implements ManagedContent{
    private final String message;

    public ContentService(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public void triggerALog(String value){
        log.info("Trigger a log with " + value);
    }

    @Override
    public void triggerALog(){
        triggerALog("nothing");
    }
}
