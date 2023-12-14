package com.devcoast.PrestamosApp.controller;

import com.devcoast.PrestamosApp.model.User;
import com.devcoast.PrestamosApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController()
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getUsers() {
         return new ResponseEntity<>(userService.getUsers(),HttpStatus.OK);
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if(user.getUserId()==null){
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(user,HttpStatus.OK);
        }
    }
}
