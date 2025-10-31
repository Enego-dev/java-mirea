package lab1;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // инициализирую список целочисленных чисел
        ArrayList<Integer> nums = readIntegerLine();

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
        return parseString(content);
    }

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
