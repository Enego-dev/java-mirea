package lab18;

import java.util.Scanner;

public class Task2 {
    public static class Exception2 {
        public void exceptionDemo() {
            String intString = "";
            try {
                Scanner myScanner = new Scanner( System.in);
                System.out.print( "Enter an integer ");
                intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println( 2/i );
            } catch (NumberFormatException e){
                IO.println("Обнаружен некорректный ввод: " + intString + ". Введите целое число!");
            } catch (ArithmeticException e){
                IO.println("Попытка деления на 0");
            }
        }
    }

    static void main() {
        var e = new Exception2();
        e.exceptionDemo();
    }

    // Qwerty
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
    //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:565)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:662)
    //	at lab18.Task2$Exception2.exceptionDemo(Task2.java:11)
    //	at lab18.Task2.main(Task2.java:18)

    // 0
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at lab18.Task2$Exception2.exceptionDemo(Task2.java:12)
    //	at lab18.Task2.main(Task2.java:18)

    // 1.2
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
    //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:565)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:662)
    //	at lab18.Task2$Exception2.exceptionDemo(Task2.java:11)
    //	at lab18.Task2.main(Task2.java:18)

    // 1
    // Output: 2
}
