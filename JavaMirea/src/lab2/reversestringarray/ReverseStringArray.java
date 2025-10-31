package lab2.reversestringarray;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"Привет", "как", "у", "тебя", "дела"};

        System.out.println("String[] перед обратной сортировкой:");
        for (var element : arr){
            System.out.println(element);
        }

        System.out.println("\nСортируем...\n");
        for (int i = 0; i < arr.length / 2; i++){
            var reverseElementIndex = arr.length - 1 - i;
            var buffer = arr[reverseElementIndex];
            arr[reverseElementIndex] = arr[i];
            arr[i] = buffer;
        }

        System.out.println("String[] после обратной сортировки:");
        for (var element : arr){
            System.out.println(element);
        }
    }
}
