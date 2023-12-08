package com.devcoast.PrestamosApp.controller;

import com.devcoast.PrestamosApp.model.Loan;
import com.devcoast.PrestamosApp.model.Person;
import com.devcoast.PrestamosApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/users")
    public ResponseEntity<List<Person>> getAllUsers(){
        List<Person> usersExpected = personService.getUsers();
        return new ResponseEntity<>(usersExpected,HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id){
        Person personExpected = personService.getPersonById(id);
        if(personExpected.getPersonId()==null){
            return new ResponseEntity<>(personExpected,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personExpected,HttpStatus.OK);
    }





}
