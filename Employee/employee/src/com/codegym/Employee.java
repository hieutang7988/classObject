package com.codegym;

public class Employee {
     public int id;
     public String name;
     public String department;
     public double salary;

    public Employee(){
    }

    public Employee (int id , String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void increaseSalary() {
        this.salary += this.salary*10/100;
    }
    public  int getId() {
        return  this.id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public  String getName() {
        return  this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public  String getDepartment() {
        return  this.department;
    }
    public void setDepartment (String department) {
        this.department = department;
    }
    public  double getSalary() {
        return  this.salary;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
}

