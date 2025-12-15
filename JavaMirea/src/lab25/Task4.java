package lab25;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d*)$";
        String[] examples = {
                // исправить для нормальных годов
                "32/02/333", "25/04/26666", "01/01/2003",
                "29/02/2001", "25-04-2003"
        };

        for (String example : examples) {
            boolean matches = Pattern.matches(regex, example);
            System.out.println(example + " -> " + (matches ? "Корректная дата" : "Некорректная дата"));
        }
    }
}