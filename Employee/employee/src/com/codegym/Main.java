package com.codegym;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Hieu", "sale",2000);
        Employee employee2 = new Employee(2, "Tin", "markerting", 1500);
        employee1.increaseSalary();
        employee2.increaseSalary();
        employee2.increaseSalary();
        System.out.println("eee :" + employee1.getSalary());
        System.out.println(employee2.getSalary());
    }
}
