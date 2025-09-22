package ru.mirea.lab3;

public class EmployeeReport {
    public static void generateReport(Employee[] employees){
        // %n - новая строка
        System.out.printf("%-40s | %-15s%n", "ФИО", "Зарплата");
        for (var employee : employees){
            System.out.printf("%-40s | %7.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
