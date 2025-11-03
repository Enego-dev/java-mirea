package lab11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    static void main() {
        var arrList = new ArrayList<Integer>();
        var arrListMillisStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrList.add(i);
        }
        arrList.sort((s1, s2) -> Integer.compare(s2, s1));
        var arrListMillisEnd = System.currentTimeMillis();
        IO.println(arrListMillisEnd - arrListMillisStart);


        var linkedList = new LinkedList<Integer>();
        var linkedListMillisStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        linkedList.sort((s1, s2) -> Integer.compare(s2, s1));
        var linkedListMillisEnd = System.currentTimeMillis();
        IO.println(linkedListMillisEnd - linkedListMillisStart);
    }
}
