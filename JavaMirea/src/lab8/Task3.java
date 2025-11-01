package lab8;

import java.util.Scanner;

public class Task3 {
    static void main() {
        var scanner = new Scanner(System.in);
        var a = Integer.parseInt(scanner.nextLine());
        var b = Integer.parseInt(scanner.nextLine());
        recursion(a, b);
    }

    private static void recursion(int a, int b){
       if (a < b + 1){
           IO.println(a);

           if (a == b)
               return;

           recursion(a + 1, b);
       }

       if (a > b - 1){
           IO.println(a);

           if (a == b)
               return;

           recursion(a - 1, b);
       }
    }
}
