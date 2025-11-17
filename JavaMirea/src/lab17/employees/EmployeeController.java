package lab17.employees;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    public EmployeeController(Employee employee, EmployeeView employeeView){
        model = employee;
        view = employeeView;
    }

    public String getEmployeeFullName(){
        return model.getFullName();
    }

    public void setEmployeeFullName(String fullName){
        model.setFullName(fullName);
    }

    public Employee.JobTime getEmployeeJobTime(){
        return model.getJobTime();
    }

    public void setEmployeeJobTime(Employee.JobTime jobTime){
        model.setJobTime(jobTime);
    }

    public int getEmployeeSalary(){
        return model.getSalary();
    }

    public void setEmployeeSalary(int salary){
        model.setSalary(salary);
    }

    public Employee.Position getEmployeePosition(){
        return model.getPosition();
    }

    public void setEmployeePosition(Employee.Position position){
        model.setPosition(position);
    }

    public double getEmployeeFinalSalary(){
        return model.getFinalSalary();
    }

    public void updateView(){
        view.printEmployeeDetails(getEmployeeFullName(), getEmployeeJobTime(), getEmployeeSalary(),
                getEmployeePosition(), getEmployeeFinalSalary());
    }
}
