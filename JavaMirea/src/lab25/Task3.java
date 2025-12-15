package lab25;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        // matches - полное совпадение с начала строки до её конца
        // lookingAt - совпадение с начала строки до конечной позиции совпадения
        // find - совпадение с позиции начала совпадения до его конца

        var text1 = "(1 - 8) - 9 / 4 ";
        var text2 = "6 / 5 – 2 * 9   ";
        var regex = "\\d\\s\\+";
        var pattern = Pattern.compile(regex);
        var matcher1 = pattern.matcher(text1);
        var matcher2 = pattern.matcher(text2);
        IO.println(text1 + "\t->\t" + matcher1.find());
        IO.println(text2 + "\t->\t" + matcher2.find());
    }
}