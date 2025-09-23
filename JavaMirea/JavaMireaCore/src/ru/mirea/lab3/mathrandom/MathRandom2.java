package ru.mirea.lab3.mathrandom;

import java.util.Random;

public class MathRandom2 {
    public static void main(String[] args) {
        var arr = new int[4];
        var random = new Random();
        boolean isSorted = false;

        while (!isSorted){
            for (int i = 0; i < 4; i++) {
                arr[i] = random.nextInt(10, 100);
            }

            for (var e : arr){
                System.out.print(e + " ");
            }
            isSorted = isSorted(arr);
            System.out.println("Строго возрастающий массив: " + isSorted);
        }
    }

    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
