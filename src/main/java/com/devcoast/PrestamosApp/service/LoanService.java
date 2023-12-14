package com.devcoast.PrestamosApp.service;

import com.devcoast.PrestamosApp.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoanService {
    public List<Loan> getLoans();
    public Loan getLoanById(Long id);
    public Loan saveLoan(Loan loan);
    void deleteTodo(Long todoId);
}
