package com.devcoast.PrestamosApp.service.impl;

import com.devcoast.PrestamosApp.model.Loan;
import com.devcoast.PrestamosApp.model.User;
import com.devcoast.PrestamosApp.repository.LoanRepository;
import com.devcoast.PrestamosApp.repository.UserRepository;
import com.devcoast.PrestamosApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
