package lab25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    static void main(String[] args) {
        String text = "Цены: 25.98 USD, 1000 RUB, 44 ERR, 0.004 EU, 1500.50 RU, 12.99 USD, 0 EU.";
        String regex = "\\b\\d+(\\.\\d+)?\\s+(USD|RUB|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}