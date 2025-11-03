package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private StudentFormatDate format;
    private final Date dateOfBirth;

    public Student(Date dateOfBirth, StudentFormatDate format){
        this.format = format;
        this.dateOfBirth = dateOfBirth;
    }

    public StudentFormatDate getFormat(){
        return format;
    }

    public void setFormat(StudentFormatDate format){
        this.format = format;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    @Override
    public String toString() {
        var dt = new SimpleDateFormat();

        switch (format){
            case Short -> dt.applyPattern("d.M.yy");
            case Middle -> dt.applyPattern("dd MMM yyyy");
            case Long -> dt.applyPattern("dd MMMM yyyy");
        }

        return dt.format(dateOfBirth);
    }
}
