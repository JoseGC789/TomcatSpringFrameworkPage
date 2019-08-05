package com.apishow.dao;

import com.apishow.entities.PersonEntity;
import java.util.List;

public interface PersonDao{
    PersonEntity create(String name);
    List<PersonEntity> findAll(String name);
}
