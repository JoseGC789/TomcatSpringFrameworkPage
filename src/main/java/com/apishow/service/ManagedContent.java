package com.apishow.service;

public interface ManagedContent{
    void setMessage(String msg);

    void writeToDao();

    void writeToDao(String msg);

    String getMessage();

}
