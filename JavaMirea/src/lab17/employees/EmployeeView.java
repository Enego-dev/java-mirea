package lab17.employees;

public class EmployeeView {
    public void printEmployeeDetails(String employeeFullName, Employee.JobTime employeeJobTime, int employeeSalary,
                                     Employee.Position employeePosition, double employeeFinalSalary){
        IO.println("ФИО: " + employeeFullName);
        IO.println("Занятость: " + employeeJobTime);
        IO.println("Оклад: " + employeeSalary);
        IO.println("Должность: " + employeePosition);
        IO.println("Зарплата: " + employeeFinalSalary);
    }
}
