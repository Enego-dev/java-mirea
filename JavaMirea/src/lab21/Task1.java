package lab21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    static void main() {
        var t = new Integer[] {1, 2, 3, 4, -10};
        var list = getListFromArray(t);
        list.forEach(IO::println);
    }

    private static <T> List<T> getListFromArray(T[] arr){
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
