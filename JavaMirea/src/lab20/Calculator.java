package lab20;

public class Calculator {
    public static <T extends Number, U extends Number> Double sum(T a, U b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> Double multiply(T a, U b){
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> Double divide(T a, U b){
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> Double subtraction(T a, U b){
        return a.doubleValue() - b.doubleValue();
    }
}
