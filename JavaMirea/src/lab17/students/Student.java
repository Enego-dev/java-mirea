package lab17.students;

public class Student {
    // код студака
    private String rollNo;
    private String name;

    public Student(String rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(){

    }

    public String getRollNo(){
        return rollNo;
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}