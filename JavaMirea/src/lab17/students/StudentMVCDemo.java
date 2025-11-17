package lab17.students;

public class StudentMVCDemo {
    static void main() {
        var student = receiveStudentFromDatabase();
        var view = new StudentView();
        var studentController = new StudentController(student, view);
        studentController.updateView();

        studentController.setStudentRollNo("24К0031");
        studentController.setStudentName("Медведев Мишаня Евгенич");
        IO.println("\nАктуальные данные студента после обновления:\n");
        studentController.updateView();
    }

    private static Student receiveStudentFromDatabase(){
        var student = new Student();
        student.setRollNo("24К0030");
        student.setName("Медведев Михаил Евгеньевич");
        return student;
    }
}
