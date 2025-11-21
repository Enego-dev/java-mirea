package lab23.abstracts;

import lab23.Queue;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size = 0;
    protected int CAPACITY = -1;

    @Override
    public boolean isFull() {
        return CAPACITY > 0 && size == CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
