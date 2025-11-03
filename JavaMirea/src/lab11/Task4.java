package lab11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    static void main() {
        var dates = new ArrayList<Date>();
        var calendars = new ArrayList<Calendar>();

        IO.println("Для выхода из программы введите 0");
        IO.println("Введите <Год>/<Месяц>/<Число>, а с новой строки введите <Часы>:<минуты>");
        var scanner = new Scanner(System.in);
        String date, calendar;
        while (true){
            date = scanner.nextLine();
            if (date.equals("0"))
                break;
            calendar = scanner.nextLine();
            if (calendar.equals("0"))
                break;

            dates.add(parseDate(date));
            calendars.add(parseCalendar(calendar));
        }

        var dateFormat = new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss");

        for (var date1 : dates){
            IO.println(dateFormat.format(date1));
        }

        for (var calendar1 : calendars){
            IO.println(dateFormat.format(calendar1.getTime()));
        }
    }

    private static Date parseDate(String date){
        var splitDate = date.split("/");
        var newDate = new Date();
        newDate.setYear(Integer.parseInt(splitDate[0]) - 1900);
        newDate.setMonth(Integer.parseInt(splitDate[1]) - 1);
        newDate.setDate(Integer.parseInt(splitDate[2]));

        newDate.setHours(0);
        newDate.setMinutes(0);
        newDate.setSeconds(0);

        newDate.getTime();

        return newDate;
    }

    private static Calendar parseCalendar(String calendar){
        var splitTime = calendar.split(":");
        var newCalendar = Calendar.getInstance();
        newCalendar.set(Calendar.MINUTE, Integer.parseInt(splitTime[1]));
        newCalendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(splitTime[0]));
        newCalendar.set(Calendar.SECOND, 0);
        newCalendar.getTime();
        return newCalendar;
    }
}
