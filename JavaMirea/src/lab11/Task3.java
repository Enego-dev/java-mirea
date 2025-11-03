package lab11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    static void main() {
        var dateOfBirth = new GregorianCalendar(2006, Calendar.NOVEMBER, 18);
        var student = new Student(dateOfBirth.getTime(), StudentFormatDate.Short);
        IO.println(student);
        student.setFormat(StudentFormatDate.Middle);
        IO.println(student);
        student.setFormat(StudentFormatDate.Long);
        IO.println(student);
    }
}
