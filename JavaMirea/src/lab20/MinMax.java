package lab20;

import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array){
        this.array = array;
    }

    public T getMin(){
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }

    public T getMax(){
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }
}
