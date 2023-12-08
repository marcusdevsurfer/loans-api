package com.devcoast.PrestamosApp.repository;

import com.devcoast.PrestamosApp.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {

}
