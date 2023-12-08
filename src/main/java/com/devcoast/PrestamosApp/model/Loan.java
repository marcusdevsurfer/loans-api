package com.devcoast.PrestamosApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanid;

    @ManyToOne
    private Person person;
    private double quantity;
    private int porcent;

    public Loan() {
    }

    public Loan(Long loanid, Person person, double quantity, int porcent) {
        this.loanid = loanid;
        this.person = person;
        this.quantity = quantity;
        this.porcent = porcent;
    }

    public Long getLoanId() {
        return loanid;
    }

    public void setLoanId(Long loanId) {
        this.loanid = loanId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getPorcent() {
        return porcent;
    }

    public void setPorcent(int porcent) {
        this.porcent = porcent;
    }
}
