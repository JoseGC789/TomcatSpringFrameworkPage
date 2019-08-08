package com.apishow.dao;

import com.apishow.entities.PersonEntity;
import java.util.List;

public interface PersonDao{
    PersonEntity create(PersonEntity person);
    List<PersonEntity> findAll();
}
