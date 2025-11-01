package lab8;

public class Task2 {
    static void main() {
        // вывести от 1 до n
        recursion(20, 0);
    }

    private static void recursion(int n, int count){
        if (n < 1)
            return;

        if (count < 1)
            count = 1;

        if (count <= n){
            IO.print(count + " ");
            recursion(n, count + 1);
        }
    }
}
