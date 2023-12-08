package com.devcoast.PrestamosApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personid;

    @Column(name = "person_name")
    private String name;
    @Column(name = "person_lastname")
    private String lastname;

    public Person() {
    }

    public Person(Long personid, String name, String lastname) {
        this.personid = personid;
        this.name = name;
        this.lastname = lastname;
    }

    public Long getPersonId() {
        return personid;
    }

    public void setPersonId(Long personId) {
        this.personid = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personid +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
