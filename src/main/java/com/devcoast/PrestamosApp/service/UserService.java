package com.devcoast.PrestamosApp.service;

import com.devcoast.PrestamosApp.model.User;

import java.util.List;

public interface UserService {
        public List<User> getUsers();
        public User getUserById(Long id);
        public User saveUser(User user);
}
