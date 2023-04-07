package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fist_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;



    /*//contructor--------
    public Employee(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public Employee() {
    }
    //-----------------------

    *//**
     //GETTER & SETTER
     *
     * @return id
     *//*
    public long getId() {
        return this.id;
    }

    *//**
     * set field
     *
     * @param id
     *//*
    public void setId(long id) {
        this.id = id;
    }

    *//**
     * get field
     *
     * @return firstName
     *//*
    public String getFirstName() {
        return this.firstName;
    }

    *//**
     * set field
     *
     * @param firstName
     *//*
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    *//**
     * get field
     *
     * @return lastName
     *//*
    public String getLastName() {
        return this.lastName;
    }

    *//**
     * set field
     *
     * @param lastName
     *//*
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    *//**
     * get field
     *
     * @return emailId
     *//*
    public String getEmailId() {
        return this.emailId;
    }

    *//**
     * set field
     *
     * @param emailId
     *//*
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }*/
    //-----------------------------------------
}
