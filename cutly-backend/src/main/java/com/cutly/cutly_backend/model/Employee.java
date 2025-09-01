package com.cutly.cutly_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    // Atribute

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public String id;

    @Column(name = "name")
    public String name;

    @Column(name = "age")
    public int age;

    @Column(name = "cpf")
    public String cpf;

    @Column(name = "email")
    public String email;

    // Add 31/08/25
    @Column(name = "gender")
    public char gender;

    @Column(name = "birthData")
    public String birthData;

    // Constructor
    public Employee(String name, int age, String cpf, String email, char gender, String birthData) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.email = email;

        // Add 31/08/25
        this.gender = gender;
        this.birthData = birthData;
    }

    // Class constructor
    public Employee(){};

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = gender;
    }

    public String getBirthData() {
        return birthData;
    }

    public void setBirthData(String birthData) {
        this.birthData = birthData;
    }

    public String toString(){
        return "Nome: " +
                name +
                "\nAge: " +
                age +
                "\nCPF: " +
                cpf +
                "\nE-mail: " +
                email +
                "\nGender: " +
                gender +
                "\nBirth data: " +
                birthData;
    }
}
