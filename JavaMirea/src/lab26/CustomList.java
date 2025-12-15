package lab26;

import java.util.function.Consumer;

// Интерфейс для нашего списка
public interface CustomList<T> extends Iterable<T> {
    void add(T element);
    T get(int index);
    int size();
    boolean isEmpty();
}