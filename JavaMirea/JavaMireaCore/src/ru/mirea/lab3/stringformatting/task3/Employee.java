package ru.mirea.lab3.stringformatting.task3;

public class Employee {
    private final String fullName;
    private final float salary;

    public Employee(String fullName, float salary){
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }
}
