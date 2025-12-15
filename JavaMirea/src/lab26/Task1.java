package lab26;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив:");
        printArray(array);

        swapPairsUsingStack(array);

        System.out.println("Массив после попарной замены (1 с последним, 2 с предпоследним и т.д.):");
        printArray(array);
    }

    public static void swapPairsUsingStack(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Помещаем все элементы в стек
        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = stack.pop(); // последний элемент становится на место i-го
            array[array.length - 1 - i] = temp; // i-й элемент становится на место последнего
        }

        // Если массив нечетной длины, средний элемент остаётся на месте
        // и стек будет содержать один элемент (средний), который нужно игнорировать
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}