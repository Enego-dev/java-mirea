package ru.mirea.lab3;

public class Employee {
    private String fullname;
    private float salary;

    public Employee(String fullname, float salary){
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public float getSalary() {
        return salary;
    }
}
