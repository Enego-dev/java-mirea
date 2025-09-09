package ru.mirea.lab1;

public class Task5 {
    public static long factorial(long n){
        if(n < 0){
            throw new IllegalArgumentException("Аргумент n должен быть >= 0!");
        }

        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

    public static void main(String[] args){
        for (int i = 0; i <= 10; i++){
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
