package lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Task2 {
    static void main() {
        var calendar = Calendar.getInstance();
        var dt = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        var currentTime = calendar.getTime();
        //IO.println(dt.format(currentTime));

        IO.println("Введите дату в формате день.месяц.год час:минута:секунда");

        var scanner = new Scanner(System.in);
        var customDate = scanner.nextLine();
        var splitCustomDate = customDate.split(" ");

        var date = splitCustomDate[0];
        var time = splitCustomDate[1];

        var splitDate = date.split("\\.");
        var splitTime = time.split(":");

        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(splitDate[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(splitDate[1]));
        calendar.set(Calendar.YEAR, Integer.parseInt(splitDate[2]));
        calendar.set(Calendar.HOUR, Integer.parseInt(splitTime[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(splitTime[1]));
        calendar.set(Calendar.SECOND, Integer.parseInt(splitTime[2]));

        var customTime = calendar.getTime();

        IO.println(dt.format(currentTime));
        IO.println(dt.format(customTime));

        IO.println("Введенное время больше системного или нет?");
        IO.println(customTime.after(currentTime));
    }
}
