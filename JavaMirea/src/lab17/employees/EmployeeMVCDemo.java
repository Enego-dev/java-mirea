package lab17.employees;

public class EmployeeMVCDemo {
    static void main() {
        var employee = receiveEmployee1FromDB();
        var view = new EmployeeView();
        var controller = new EmployeeController(employee, view);
        controller.updateView();

        IO.println("\nАктуальные данные студента после обновления:\n");

        employee = receiveEmployee2FromDB();
        controller.setEmployeeFullName(employee.getFullName());
        controller.setEmployeeJobTime(employee.getJobTime());
        controller.setEmployeeSalary(employee.getSalary());
        controller.setEmployeePosition(employee.getPosition());
        controller.updateView();
    }

    private static Employee receiveEmployee1FromDB(){
        var employee = new Employee();
        employee.setFullName("Медведев Михаил Евгеньевич");
        employee.setJobTime(Employee.JobTime.FullTime);
        employee.setSalary(69000);
        employee.setPosition(Employee.Position.Engineer);
        return employee;
    }

    private static Employee receiveEmployee2FromDB(){
        var employee = new Employee();
        employee.setFullName("Кузбасов Андрей Геннадьевич");
        employee.setJobTime(Employee.JobTime.PartTime);
        employee.setSalary(50000);
        employee.setPosition(Employee.Position.Cleaner);
        return employee;
    }
}
