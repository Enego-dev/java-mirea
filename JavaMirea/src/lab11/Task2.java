package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    static void main() {
        var date = new Date();
        var dt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        var currentTime = date.getTime();

        IO.println("Введите дату в формате день.месяц.год час:минута:секунда");

        var scanner = new Scanner(System.in);
        var customDate = scanner.nextLine();
        var splitCustomDate = customDate.split(" ");

        var datePart = splitCustomDate[0];
        var timePart = splitCustomDate[1];

        var splitDate = datePart.split("\\.");
        var splitTime = timePart.split(":");

        int day = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int year = Integer.parseInt(splitDate[2]);
        int hours = Integer.parseInt(splitTime[0]);
        int minutes = Integer.parseInt(splitTime[1]);
        int seconds = Integer.parseInt(splitTime[2]);

        var calendar = java.util.Calendar.getInstance();
        calendar.setLenient(false);
        calendar.set(year, month - 1, day, hours, minutes, seconds);

        try {
            calendar.getTime();

            date.setDate(day);
            date.setMonth(month - 1);
            date.setYear(year - 1900);
            date.setHours(hours);
            date.setMinutes(minutes);
            date.setSeconds(seconds);

            var customTime = date.getTime();

            IO.println(dt.format(currentTime));
            IO.println(dt.format(customTime));

            IO.println("Введенное время больше системного или нет?");
            IO.println(customTime > currentTime);

        } catch (Exception e) {
            throw new IllegalArgumentException("Некорректная дата: " + customDate);
        }
    }
}