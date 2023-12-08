package com.devcoast.PrestamosApp.controller;

import com.devcoast.PrestamosApp.model.Loan;
import com.devcoast.PrestamosApp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LoanController {
    @Autowired
    LoanService loanService;
    @GetMapping("/loans")
    public List<Loan> getLoans() {
        return loanService.getLoans();
    }

    @GetMapping("/loans/{id}")
    public Loan getLoanById(@PathVariable Long id){
        Loan loanExpected =  loanService.getLoanById(id);
        if(loanExpected==null){
            throw new RuntimeException("No se encontro a la persona");
        }
        return loanExpected;
    }

    @PostMapping("/loans")
    public Loan addLoan(@RequestBody Loan loan) {
        return loanService.saveLoan(loan);
    }
}
