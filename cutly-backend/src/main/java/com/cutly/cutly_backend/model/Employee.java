package com.cutly.cutly_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    // Atribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "age")
    public int age;

    @Column(name = "cpf")
    public String cpf;

    @Column(name = "email")
    public String email;

    // Constructor
    public Employee(String name, int age, String cpf, String email) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.email = email;
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
}
