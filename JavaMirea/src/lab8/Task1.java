package lab8;

public class Task1 {
    static void main() {
        // Дана монотонная последовательность, в которой каждое натуральное
        // число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,...
        // По возможности только один цикл


        /*var k = 9;
        for (int i = 1; i < k + 1; i++) {
            var count = 0;
            while (count != i){
                IO.print(i);
                count++;
            }
            IO.println("");
        }*/

        // k - сколько раз выполнится рекурсия
        // count - счетчик, всегда передавать 0
        // current - всегда передавать 1
        // n - сколько элементов строки будет выведено
        // countN - счетчик, всегда передавать 0
        // carriageReturn - переносить ли новое число на новую строку

        recursion(4, 0, 1, 8, 0, true);
        recursion(8, 0, 1, 16, 0, false);
    }

    private static void recursion(int k, int count, int current, int n, int countN, boolean carriageReturn){
        if (current > k || countN > n){
            IO.println("");
            return;
        }

        if (count == current){
            if(carriageReturn)
                IO.println("");

            recursion(k, 0, current + 1, n, countN, carriageReturn);
        }

        if (count < current){
            IO.print(current);
            recursion(k, count + 1, current, n, countN + 1, carriageReturn);
        }
    }
}
