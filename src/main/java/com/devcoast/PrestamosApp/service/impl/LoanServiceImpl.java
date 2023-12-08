package com.devcoast.PrestamosApp.service.impl;

import com.devcoast.PrestamosApp.model.Loan;
import com.devcoast.PrestamosApp.repository.LoanRepository;
import com.devcoast.PrestamosApp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanRepository loanRepository;
    @Override
    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(new Loan());
    }

    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }


}
