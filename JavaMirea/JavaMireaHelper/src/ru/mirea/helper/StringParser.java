package ru.mirea.helper;

import java.util.ArrayList;

public class StringParser {
    // объявляю новый метод по конвертации строки целочисленных чисел в их список
    public static ArrayList<Integer> parseString(String content) {
        // инициализирую список целочисленных чисел
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // разбиваю строку по пробелам
        var splitContent = content.split(" ");
        for (String part : splitContent) {
            // пробую конвертировать строку-число в Integer
            try {
                var num = Integer.parseInt(part);   // конвертирую
                nums.add(num);  // добавляю в список
            }
            // при ошибке конвертации обрабатываю её и сообщаю об этом пользователю
            catch (NumberFormatException ex) {
                System.out.println("Введенная строка не может быть конвертирована в целое число: " + part);
                return null;    // досрочно выхожу из метода
            }
        }

        return nums;    // возвращаю список
    }
}
