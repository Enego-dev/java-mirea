package lab9;

public record Student(int studentId, int gpa) implements Comparable<Student> {
    @Override
    public int compareTo(Student student) {
        return Integer.compare(studentId, student.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", gpa=" + gpa +
                '}';
    }
}
