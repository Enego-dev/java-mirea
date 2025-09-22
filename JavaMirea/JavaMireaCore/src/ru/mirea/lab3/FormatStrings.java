package ru.mirea.lab3;

import java.util.Scanner;

public class FormatStrings {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var converter = new ConvertCurrency();

        String content = "Вы выбрали Samsung Galaxy S25 Ultra";
        var usDollarPrice = 1250;
        var russianPrice = converter.getRuble(usDollarPrice);
        boolean isUsDollar = true;
        while (true){
            var price = isUsDollar ? usDollarPrice : russianPrice;
            var addition = isUsDollar ? "$" : "rub";
            System.out.println(content + " " + price + addition);
            var ctx = scanner.nextLine();
            if(ctx.equals("1"))
                isUsDollar = false;
            else
                isUsDollar = true;
        }
    }
}
