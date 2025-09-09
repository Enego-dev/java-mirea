package ru.mirea.lab1;

import ru.mirea.helper.ReadIntegers;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // инициализирую список целочисленных чисел
        ArrayList<Integer> nums = ReadIntegers.readIntegerLine();

        // если список пустой (возможно, ошибка при конвертации)
        if (nums == null) {
            System.out.println("Невозможно конвертировать эту строку в список целых чисел");
            return;
        }

        // считаю сумму через for
        var summa = 0;
        for (Integer num : nums) {
            summa += num;
        }

        // вывожу сумму и среднеарифметическое
        String message = MessageFormat.format("Сумма чисел: {0}.\nСреднее арифметическое: {1}.",
                summa, (float) summa / nums.size());
        System.out.println(message);
    }
}
