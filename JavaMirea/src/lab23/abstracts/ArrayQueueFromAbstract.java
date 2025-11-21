package lab23.abstracts;

public class ArrayQueueFromAbstract<T> extends AbstractQueue<T>{
    private int first = 0;
    private int last = -1;
    private T[] array;

    public ArrayQueueFromAbstract(){
        array = (T[]) new Object[10];
    }

    public ArrayQueueFromAbstract(int capacity){
        CAPACITY = capacity;
        array = (T[]) new Object[CAPACITY];
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull())
            return false;

        // Нужно ли расширение для неограниченной очереди
        if (CAPACITY == -1 && size == array.length) {
            ensureCapacity();
        }

        // Циклическое движение last
        last = (last + 1) % array.length;
        array[last] = t;
        size++;

        // Если это первый элемент, синхронизирую first
        if (size == 1) {
            first = last;
        }

        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            return null;

        T firstElement = array[first];
        array[first] = null;

        // Циклическое движение first
        first = (first + 1) % array.length;
        size--;

        // Если очередь стала пустой, сбрасываем индексы
        if (isEmpty()) {
            first = 0;
            last = -1;
        }

        return firstElement;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : array[first];
    }

    @Override
    public void display() {
        if (isEmpty()) {
            IO.println("Очередь пуста!");
            return;
        }

        IO.println("Элементы очереди:");
        int current = first;
        for (int i = 0; i < size; i++) {
            IO.println(array[current]);
            current = (current + 1) % array.length;
        }
    }

    private void ensureCapacity(){
        T[] newArray = (T[]) new Object[array.length * 2];

        // Копируем элементы с учетом циклического буфера
        if (first <= last) {
            // Элементы расположены последовательно
            System.arraycopy(array, first, newArray, 0, size);
        } else {
            // Элементы "завернули" через конец массива
            int firstPart = array.length - first;
            System.arraycopy(array, first, newArray, 0, firstPart);
            System.arraycopy(array, 0, newArray, firstPart, last + 1);
        }

        array = newArray;
        first = 0;
        last = size - 1;
    }
}
