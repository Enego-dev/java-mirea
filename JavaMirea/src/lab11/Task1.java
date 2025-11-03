package lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task1 {
    static void main() {
        // так как задание непонятное, то вычислю время выполнение всей 11 практики
        System.out.printf("Медведев | 03.11.2025 | 11:35\n");

        //var currentTimeMillis = System.currentTimeMillis(); // 1762158904635
        var currentTimeMillis = 1762158904635L;
        IO.println(currentTimeMillis);

        var endTimeMillis = System.currentTimeMillis(); // 15:14
        IO.println(endTimeMillis);  //1762171858754

        var calendar = Calendar.getInstance();
        calendar.setTimeInMillis(endTimeMillis - currentTimeMillis);
        IO.println(new SimpleDateFormat("HH:mm:ss:S").format(calendar.getTime()));
    }
}
