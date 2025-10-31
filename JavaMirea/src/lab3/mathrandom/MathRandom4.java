package lab3.mathrandom;

import java.util.Random;
import java.util.Scanner;

public class MathRandom4 {
    public static void main(String[] args) {
        int limit = 0;
        var scanner = new Scanner(System.in);
        var random = new Random();

        System.out.println("Введите целое число больше 0");
        while (limit <= 0){
            try {
                limit = Integer.parseInt(scanner.nextLine());
                if (limit <= 0){
                    System.out.println("Вы не ввели число, которое больше 0. Повторите попытку.");
                }
            } catch (Exception e){
                System.out.println("Вы не ввели число, которое больше 0. Повторите попытку.");
            }
        }

        var arr1 = new int[limit];
        var arr2 = new int[limit];
        for (int i = 0; i < arr1.length; i++) {
            var number = random.nextInt(limit + 1);
            arr1[i] = number;
            if(number % 2 == 0){
                arr2[i] = number;
            }
        }

        System.out.print("\nМассив:");
        for (var e : arr1){
            System.out.print(" " + e);
        }
        System.out.print("\nПодмассив из четных чисел:");
        for (var e : arr2){
            if(e != 0){
                System.out.print(" " + e);
            }
        }
    }
}
