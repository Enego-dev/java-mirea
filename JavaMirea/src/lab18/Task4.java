package lab18;

import java.util.Scanner;

public class Task4 {
    public static class Exception2 {
        public void exceptionDemo() {
            try {
                Scanner myScanner = new Scanner( System.in);
                System.out.print( "Enter an integer ");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println( 2/i );
            } catch (Exception e){
                IO.println(e);  // Теперь выдается просто код ошибки, а не выбрасывается исключение
            }
            finally {
                IO.println("Выполнение работы завершено!");
            }
        }
    }

    static void main() {
        var e = new Exception2();
        e.exceptionDemo();
    }
}
