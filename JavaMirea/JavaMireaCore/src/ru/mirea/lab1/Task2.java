package ru.mirea.lab1;

import ru.mirea.helper.ReadIntegers;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        // инициализирую список целочисленных чисел
        ArrayList<Integer> nums = ReadIntegers.readIntegerLine();

        // если список пустой (возможно, ошибка при конвертации)
        if (nums == null) {
            System.out.println("Невозможно конвертировать эту строку в список целых чисел");
            return;
        }

        // считаю сумму через while
        int summa = 0;
        int i = 0;

        while (i < nums.size()) {
            summa += nums.get(i);
            i++;
        }

        // вывожу сумму и среднеарифметическое через while
        String message = MessageFormat.format("Через while\nСумма чисел: {0}.\nСреднее арифметическое: {1}.",
                summa, (float) summa / nums.size());
        System.out.println(message);

        // считаю сумму через do while
        summa = 0;
        i = 0;

        if (!nums.isEmpty()) {
            do {
                summa += nums.get(i);
                i++;
            } while (i < nums.size());
        }

        // вывожу сумму и среднеарифметическое через do-while
        message = MessageFormat.format("\nЧерез do-while\nСумма чисел: {0}.\nСреднее арифметическое: {1}.",
                summa, (float) summa / nums.size());
        System.out.println(message);
    }
}
