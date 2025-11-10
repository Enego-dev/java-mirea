package lab9;

public class InsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            T current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = current;
        }
    }
}
