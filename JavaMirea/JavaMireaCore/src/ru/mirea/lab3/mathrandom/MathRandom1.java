package ru.mirea.lab3.mathrandom;

import java.util.Arrays;

public class MathRandom1 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.random();
        }

        System.out.println("\nНеотсортированный массив вещественных чисел:");

        for (var e : arr){
            System.out.println(e);
        }

        System.out.println("\nСортируем:");

        arr = Arrays.stream(arr).sorted().toArray();

        for (var e : arr){
            System.out.println(e);
        }
    }
}
