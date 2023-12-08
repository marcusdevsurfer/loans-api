package com.devcoast.PrestamosApp.service.impl;

import com.devcoast.PrestamosApp.model.Person;
import com.devcoast.PrestamosApp.repository.PersonRepository;
import com.devcoast.PrestamosApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getUsers() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(new Person());
    }


}
