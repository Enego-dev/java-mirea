package lab25;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String pattern = "^abcdefghijklmnopqrstuv18340$";
        String[] examples = {
                "abcdefghijklmnopqrstuv18340", // правильный
                "abcdefghijklmnoasdfasdpqrstuv18340" // неправильный
        };

        for (String example : examples) {
            boolean matches = Pattern.matches(pattern, example);
            System.out.println(example + " -> " + (matches ? "Соответствует" : "Не соответствует"));
        }
    }
}
