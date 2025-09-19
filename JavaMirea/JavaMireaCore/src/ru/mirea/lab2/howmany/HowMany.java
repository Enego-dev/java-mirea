package ru.mirea.lab2.howmany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var line = scanner.nextLine();
        if(line.isEmpty()){
            System.out.println("Слов: 0");
        }

        var brr = line.split(" ");
        int count = 0;
        for (var element : brr){
            if(!element.isEmpty())
                count++;
        }

        System.out.println("Слов: " + count);
    }
}
