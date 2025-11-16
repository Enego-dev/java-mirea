package lab15;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

public class CalculatorSequence {
    private final String expression;

    public CalculatorSequence(String expression){
        this.expression = expression;
    }

    private static String multiply(String expression){
        var parts = expression.split("\\*");
        var part1 = new BigDecimal(parts[0].trim());
        var part2 = new BigDecimal(parts[1].trim());
        //IO.print("Операция: " + part1 + " * " + part2 + "\n");
        return part1.multiply(part2).stripTrailingZeros().toString();
    }

    private static String divide(String expression) {
        var parts = expression.split("/");
        var part1 = new BigDecimal(parts[0].trim());
        var part2 = new BigDecimal(parts[1].trim());
        //IO.print("Операция: " + part1 + " / " + part2 + "\n");
        // деление до 10 знаков с округлением до целого по правилам математики
        return part1.divide(part2, 10, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    private static String add(String expression){
        var parts = expression.split("\\+");
        var part1 = new BigDecimal(parts[0].trim());
        var part2 = new BigDecimal(parts[1].trim());
        //IO.print("Операция: " + part1 + " + " + part2 + "\n");
        return part1.add(part2).stripTrailingZeros().toString();
    }

    private static String subtract(String expression){
        var parts = expression.split("-");
        var part1 = new BigDecimal(parts[0].trim());
        var part2 = new BigDecimal(parts[1].trim());
        //IO.print("Операция: " + part1 + " - " + part2 + "\n");
        return part1.subtract(part2).stripTrailingZeros().toString();
    }

    public String calculate(){
        try {

            var result = expression;

            var regex = "\\d+(\\.\\d*)? [*/] \\d+(\\.\\d*)?";
            var pattern = Pattern.compile(regex);
            var matcher = pattern.matcher(result);

            while (matcher.find()) {
                var match = matcher.group();

                var replacement = "";
                if (match.contains("*"))
                    replacement = multiply(match);
                else if (match.contains("/")) {
                    replacement = divide(match);
                } else {
                    throw new ArithmeticException("Невозможно посчитать значение выражения '" + match + "'.");
                }

                result = result.replace(match, replacement);
                //IO.print("Промежуточное вычисление операций первого приоритета: " + result + "\n");
                matcher = pattern.matcher(result);
            }

            //IO.println("Финальное вычисление после операций первого приоритета: " + result + "\n");

            regex = "\\d+(\\.\\d*)? [+-] \\d+(\\.\\d*)?";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(result);

            while (matcher.find()) {
                var match = matcher.group();

                var replacement = "";
                if (match.contains("+"))
                    replacement = add(match);
                else if (match.contains("-")) {
                    replacement = subtract(match);
                } else {
                    throw new ArithmeticException("Невозможно посчитать значение выражения '" + match + "'.");
                }

                result = result.replace(match, replacement);
                //IO.print("Промежуточное вычисление операций второго приоритета: " + result + "\n");
                matcher = pattern.matcher(result);
            }
            //IO.println("Финальное вычисление после операций второго приоритета: " + result + "\n");

        /*IO.println("Проверка????");
        IO.println(result);
        IO.println(matcher.matches());
        IO.println(result.matches(regex));*/

            return result;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
