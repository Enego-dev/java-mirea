package lab17.employees;

public class Employee {
    private String fullName;
    private JobTime jobTime;
    private int salary;
    private Position position;

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public JobTime getJobTime(){
        return jobTime;
    }

    public void setJobTime(JobTime jobTime){
        this.jobTime = jobTime;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public double getFinalSalary(){
        return salary * (getJobTime() == JobTime.FullTime ? 1 : 0.5) * getPositionSalary();
    }

    private double getPositionSalary(){
        return switch (getPosition()){
            case Teacher -> 1.25d;
            case Engineer -> 1.5d;
            default -> 1;
        };
    }

    public enum JobTime{
        FullTime,
        PartTime
    }

    public enum Position{
        Cleaner,
        Teacher,
        Engineer
    }
}
