package ru.mirea.helper;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadIntegers {
    public static ArrayList<Integer> readIntegerLine() {
        // даю инструкцию пользователю, что от него требуется
        System.out.println("Введите числа через пробел...\n");

        // инициализирую объект класса Scanner для считывания входящего потока данных из консоли
        Scanner sc = new Scanner(System.in);
        // считываю данные из входящего потока
        var content = sc.nextLine();

        // если строка пустая, то сообщаю об этом пользователю
        if (content.isEmpty()) {
            System.out.println("Вы не ввели строку.");
            return null; // выхожу из программы
        }

        // возвращаю список целочисленных чисел, может быть пустым!
        return StringParser.parseString(content);
    }
}
