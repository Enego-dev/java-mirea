package lab22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorRPNTest {
    @Test
    public void checkSimpleAddition() {
        String expression = "5 3 +";
        var expected = "8";
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkSubtractionAndMultiplication() {
        String expression = "10 4 - 2 *";
        var expected = "12"; // (10-4)*2 = 12
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkDivisionWithDecimals() {
        String expression = "15 3 / 2.5 +";
        var expected = "7.5";; // 15/3 + 2.5 = 7.5
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkCombinedOperations() {
        String expression = "4 2 + 3 * 10 -";
        var expected = "8"; // (4+2)*3-10 = 8
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkOperationPriority() {
        String expression = "20 4 / 3 2 * +";
        var expected = "11"; // 20/4 + 3*2 = 5 + 6 = 11
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkMultipleOperations() {
        String expression = "100 20 / 5 * 10 2 + -";
        var expected = "13"; // (100/20)*5 - (10+2) = 25 - 12 = 13
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkFloatingPoint() {
        String expression = "3.14 2 * 1.5 +";
        var expected = "7.78"; // 3.14*2 + 1.5 = 7.78
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkComplexExample() {
        String expression = "15 7 1 1 + - / 3 * 2 1 1 + + -";
        var expected = "5"; // 15/(7-(1+1))*3 - (2+(1+1)) = 15/5*3 - 4 = 9 - 4 = 5
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkNegativeNumbers() {
        String expression = "5 -3 + 2 *";
        var expected = "4"; // (5 + -3) * 2 = 4
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }

    @Test
    public void checkLargeNumbersAndPrecision() {
        String expression = "1000000 500000 + 0.001 *";
        var expected = "1500"; // (1M + 500K) * 0.001 = 1500
        var calc = new CalculatorRPN();
        calc.calculate(expression);
        Assertions.assertEquals(expected, calc.getAnswerAsPlainText());
    }
}
