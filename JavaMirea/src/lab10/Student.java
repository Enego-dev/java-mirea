package lab10;

public record Student(String firstName, String lastName, String speciality, int course, String group, double gpa) {
    @Override
    public String toString() {
        /*return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';*/

        return String.format("%-8s | %-10s | %-25s | %d курс | %10s | %.1f", firstName, lastName, speciality,
                course, group, gpa);
    }
}
