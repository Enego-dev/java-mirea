package lab20;

import java.io.Serializable;

public class Task1<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T first;
    private final V second;
    private final K third;

    public Task1(T first, V second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    public K getThird(){
        return third;
    }

    public void describe(){
        IO.println(first.getClass().getTypeName());
        IO.println(second.getClass().getTypeName());
        IO.println(third.getClass().getTypeName());
    }
}
