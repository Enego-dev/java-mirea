package lab14;

import java.util.regex.Pattern;

public class Task2 {
    static void main() {
        var string = "abcdefghijklmnopqrstuv18340";
        var string2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        var regex = "^abcdefghijklmnopqrstuv18340$";
        var pattern = Pattern.compile(regex);
        IO.println(pattern.matcher(string).matches());
        IO.println(pattern.matcher(string2).matches());
    }
}
