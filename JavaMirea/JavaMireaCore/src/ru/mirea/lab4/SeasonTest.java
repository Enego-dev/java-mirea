package ru.mirea.lab4;

public class SeasonTest {
    static void main(String[] args) {
        // Создать переменную, содержащую ваше любимое время года и
        // распечатать всю информацию о нем.
        var season = Season.Summer;
        IO.println(season.getClass());

        // Создать метод, который принимает на вход переменную созданного
        // вами enum типа. Если значение равно Лето, выводим на консоль “Я
        // люблю лето” и так далее. Используем оператор switch.
        DescribeSeason(season);

        // Перечисление должно содержать переменную, содержащую среднюю
        // температуру в каждом времени года.
        // Добавить конструктор, принимающий на вход среднюю температуру.
        IO.println("Средняя температура - " + season.getAverageTemperature());

        // Создать метод getDescription, возвращающий строку “Холодное время
        // года”. Переопределить метод getDescription - для константы Лето
        // метод должен возвращать “Теплое время года”.
        IO.println("\n" + season.getDescription());

        // В цикле распечатать все времена года, среднюю температуру и
        // описание времени года
        for (var s : Season.values()){
            System.out.printf("\nНазвание - %s%nСредняя температура - %f%nОписание-%s\n", s, s.getAverageTemperature(), s.getDescription());
        }
    }

    private static void DescribeSeason(Season season){
        // зачем использовать оператор switch??
        //var arr = new String[]{"Зиму", "Весну", "Лето", "Осень"};
        //IO.println("Я люблю " + arr[season.getLevelCode()]);

        // окей, можно и через switch
        switch (season){
            case Winter -> IO.println("Я люблю Зиму");
            case Spring -> IO.println("Я люблю Весну");
            case Summer -> IO.println("Я люблю Лето");
            case Autumn -> IO.println("Я люблю Осень");
        }
        IO.println("");
    }
}
