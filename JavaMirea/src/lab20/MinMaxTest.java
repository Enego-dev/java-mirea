package lab20;

import java.util.Comparator;

public class MinMaxTest {
    static void main() {
        var minMax = new MinMax<Integer>(new Integer[]{1, 2, -3, 4, -14, 0, 35});
        IO.println(minMax.getMin());
        IO.println(minMax.getMax());
    }
}
