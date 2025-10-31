package lab3.stringformatting.task2;

import lab3.stringformatting.task1.ConvertCurrency;

import java.util.Scanner;

public class InternetShop {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var converter = new ConvertCurrency();

        String content = "Вы выбрали Samsung Galaxy S25 Ultra";
        var usDollarPrice = 1250;
        var russianPrice = converter.getRuble(usDollarPrice);
        boolean isUsDollar = true;
        /*while (true){
            var price = isUsDollar ? usDollarPrice : russianPrice;
            var addition = isUsDollar ? "$" : "rub";
            System.out.println(content + " " + price + addition);
            var ctx = scanner.nextLine();
            if(ctx.equals("1"))
                isUsDollar = false;
            else
                isUsDollar = true;
        }*/
        do {
            var price = isUsDollar ? usDollarPrice : russianPrice;
            var addition = isUsDollar ? "$" : "rub";
            System.out.println(content + " " + price + addition);
            System.out.println("Введите 1 для показа цены в долларах, 2 - в рублях");
            var input = scanner.nextLine();
            if (input.equals("1"))
                isUsDollar = true;
            if (input.equals("2"))
                isUsDollar = false;
            clearConsole();
        } while (true);
    }
    
    public static void clearConsole(){
        System.out.println("\n".repeat(25));
    }
}
