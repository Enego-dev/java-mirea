package lab25;

import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        // Пароль: минимум 8 символов, хотя бы одна заглавная, одна строчная, одна цифра
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        String[] examples = {
                "AsD", "TrySpy1",
                "smart_pass", "A007"
        };

        for (String example : examples) {
            boolean matches = Pattern.matches(regex, example);
            System.out.println(example + " -> " + (matches ? "Надёжный пароль" : "Ненадёжный пароль"));
        }
    }
}