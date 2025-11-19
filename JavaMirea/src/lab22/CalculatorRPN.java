package lab22;

import lab22.application.InvalidExpressionException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.BiFunction;

public class CalculatorRPN {
    private final Stack<BigDecimal> numbers;
    private final HashMap<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>> operators;
    private BigDecimal answer;

    public CalculatorRPN(){
        numbers = new Stack<>();
        operators = new HashMap<>();
        operators.put("+", CalculatorRPN::add);
        operators.put("-", CalculatorRPN::subtract);
        operators.put("*", CalculatorRPN::multiply);
        operators.put("/", CalculatorRPN::divide);

        /*for (var rawEx : expression.trim().split(" ")){
            var ex = rawEx.trim();

            if (ex.isEmpty() || ex.equals(" "))
                continue;

            if (ex.contains("+")){
                operations.push(Operations.Add);
                continue;
            }

            if (ex.contains("-")){
                operations.push(Operations.Subtract);
                continue;
            }

            if (ex.contains("*")) {
                operations.push(Operations.Multiply);
                continue;
            }

            if (ex.contains("/")) {
                operations.push(Operations.Divide);
                continue;
            }

            try {
                numbers.push(new BigDecimal(ex));
            } catch (NumberFormatException e){
                IO.println("Невозможно преобразовать значение к числовому типу: " + ex + "!\nПрограмма была завершена с ошибкой! Код ошибки: 1");
                System.exit(1);
            }

            if (numbers.size() - operations.size() != 1){
            IO.println("Кол-во операций должно быть меньше кол-ва чисел на 1 единицу!\nПрограмма была завершена с ошибкой! Код ошибки: 2");
            System.exit(2);
        }
            */
    }

    public void calculate(String expression){
        // Транслятор RPN-выражений основан на стэке. Каждое следующее
        //число помещается в стэк. Если встречается знак операции (обозначим его
        // *), то два числа из стека извлекаются (a = pop(), b = pop()), для них
        //вычисляется значение соответствующей бинарной арифметической
        //операции, и результат помещается в стек (push(a * b)).

        var numbersCount = 0;
        var operationsCount = 0;
        var parts = Arrays.stream(expression.replaceAll("\\s+", " ").trim().split(" ")).filter(p -> !p.isEmpty()).toList();
        for (var e : parts){
            if (e.isEmpty() || e.equals(" "))
                continue;

            if (e.matches("^[-|]?\\d+(\\.\\d*)?$")){
                try {
                    var bigDecimal = new BigDecimal(e);
                    numbers.push(bigDecimal);
                    numbersCount++;
                    continue;
                } catch (NumberFormatException ex){
                    throw new InvalidExpressionException("Невозможно преобразовать значение к числовому типу: " + ex + "!\nПрограмма была завершена с ошибкой! Код ошибки: 1");
                    //IO.println("Невозможно преобразовать значение к числовому типу: " + ex + "!\nПрограмма была завершена с ошибкой! Код ошибки: 1");
                    //System.exit(1);
                }
            }

            if (e.matches("[+-/*]")){
                var a = numbers.pop();
                var b = numbers.pop();
                numbers.push(operators.get(e).apply(b, a));
                operationsCount++;
            }
        }

        if (numbers.size() != 1 || (numbersCount - operationsCount != 1)){
            throw new InvalidExpressionException("Кол-во операций должно быть меньше кол-ва чисел на 1 единицу!\nПрограмма была завершена с ошибкой! Код ошибки: 2");
            //IO.println("Кол-во операций должно быть меньше кол-ва чисел на 1 единицу!\nПрограмма была завершена с ошибкой! Код ошибки: 2");
            //System.exit(2);
        }

        answer = numbers.pop().stripTrailingZeros();
    }

    public String getAnswerAsPlainText(){
        return answer.toPlainString();
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b){
        try {
            var ans = a.add(b);
            //IO.println(a + " + " + b + " = " + ans);
            return ans;
        } catch (Exception ex){
            throw new InvalidExpressionException("Произошла ошибка суммирования! Код ошибки: 3" + "\n" + a + " + " + b);
            //IO.println("Произошла ошибка суммирования! Код ошибки: 3" + "\n" + a + " + " + b);
            //System.exit(3);
        }
        //return null;
    }
    public static BigDecimal subtract(BigDecimal a, BigDecimal b){
        try {
            var ans = a.subtract(b);
            //IO.println(a + " - " + b + " = " + ans);
            return ans;
        } catch (Exception ex){
            throw new InvalidExpressionException("Произошла ошибка вычитания! Код ошибки: 4" + "\n" + a + " - " + b);
            //IO.println("Произошла ошибка вычитания! Код ошибки: 4" + "\n" + a + " - " + b);
            //System.exit(4);
        }
        //return null;
    }
    public static BigDecimal multiply(BigDecimal a, BigDecimal b){
        try {
            var ans = a.multiply(b);
            //IO.println(a + " * " + b + " = " + ans);
            return ans;
        } catch (Exception ex){
            throw new InvalidExpressionException("Произошла ошибка умножения! Код ошибки: 5" + "\n" + a + " * " + b);
            //IO.println("Произошла ошибка умножения! Код ошибки: 5" + "\n" + a + " * " + b);
            //System.exit(5);
        }
        //return null;
    }

    public static BigDecimal divide(BigDecimal a, BigDecimal b){
        try {
            var ans = a.divide(b, 10, RoundingMode.HALF_UP);
            //IO.println(a + " / " + b + " = " + ans);
            return ans;
        } catch (Exception ex){
            throw new InvalidExpressionException("Произошла ошибка деления! Код ошибки: 6" + "\n" + a + " / " + b);
            //IO.println("Произошла ошибка деления! Код ошибки: 6" + "\n" + a + " / " + b);
            //System.exit(6);
        }
        //return null;
    }
}
