package com.devcoast.PrestamosApp.service;

import com.devcoast.PrestamosApp.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService{
    public List<Person> getUsers();
    public Person getPersonById(Long id);
}
