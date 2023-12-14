package com.devcoast.PrestamosApp.repository;

import com.devcoast.PrestamosApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
