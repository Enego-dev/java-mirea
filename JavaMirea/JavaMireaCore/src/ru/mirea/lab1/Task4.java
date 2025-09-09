package ru.mirea.lab1;

public class Task4 {
    public static void main(String[] args) {
        /*System.out.println("Первые 10 чисел гармонического ряда:");
        System.out.println("n\tДробь\t\tДесятичная\tЧастичная сумма");
        System.out.println("-------------------------------------------------------");

        double sum = 0.0;

        for (int i = 1; i <= 10; i++) {
            double term = 1.0 / i;
            sum += term;

            System.out.printf("%d\t1/%d\t\t%.6f\t%.6f%n", i, i, term, sum);
        }*/

        System.out.println("Первые 10 чисел гармонического ряда:");
        System.out.println("------------------------------------");

        int n = 10;
        double sum = 0.0;

        System.out.printf("%-5s | %-15s | %-15s%n", "n", "Член ряда", "Частичная сумма");
        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / i;
            sum += term;

            // Форматированный вывод
            System.out.printf("%-5d | %-15.6f | %-15.6f%n", i, term, sum);
        }

        System.out.println("\nИтоговая сумма первых 10 членов: " + String.format("%.6f", sum));
    }
}
