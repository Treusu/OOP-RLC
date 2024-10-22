/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Midterm;

/**
 * Cubia, Richard L.
 * BSIT-307
 */
public class main{
static class Employee {
    public int salary;
}

static class Manager extends Employee {
    public int budget;
}

static class Director extends Manager {
    public int stockOptions;

}

public static void main(String[] args) {
    Employee employee = new Employee();
    Manager manager = new Manager();
    Director director = new Director();
    employee.salary = 50000;
    director.salary = 80000;
    director.stockOptions = 1000;
    manager.budget = 100000;
}}