package ru.mirea.lab3.stringformatting.task3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Медведев Михаил Евгеньевич", 1000);
        employees[1] = new Employee("Голиков Сан Саныч", 850);
        employees[2] = new Employee("Щеголев Иван Сергеевич", 850);

        EmployeeReport.generateReport(employees);
    }
}
