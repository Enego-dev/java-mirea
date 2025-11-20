package lab23;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLinkedList<T> implements lab23.Queue<T> {
    private final int capacity;
    private final LinkedList<T> linkedList;

    public QueueLinkedList(){
        this.capacity = -1;
        linkedList = new LinkedList<>();
    }
    public QueueLinkedList(int capacity){
        this.capacity = capacity;
        linkedList = new LinkedList<>();
    }
    public QueueLinkedList(Collection<? extends T> collection){
        this.capacity = -1;
        linkedList = new LinkedList<>(collection);
    }
    public QueueLinkedList(Collection<? extends T> collection, int capacity){
        this.capacity = capacity;
        linkedList = new LinkedList<>(collection);
    }

    @Override
    public boolean add(T t) {
        if (capacity > 0 && linkedList.size() > capacity - 1)
            throw new IllegalStateException("The queue is full!");

        linkedList.add(t);
        return true;
    }

    @Override
    public boolean offer(T t) {
        if (capacity > 0 && linkedList.size() > capacity - 1)
            return false;

        linkedList.add(t);
        return true;
    }

    @Override
    public T remove() {
        if (linkedList.isEmpty())
            throw new NoSuchElementException("Trying to remove element from the empty queue!");

        var head = linkedList.getFirst();
        linkedList.remove(head);
        return head;
    }

    @Override
    public T poll() {
        if (linkedList.isEmpty())
            return null;

        var head = linkedList.getFirst();
        linkedList.remove(head);
        return head;
    }

    @Override
    public T element() {
        if (linkedList.isEmpty())
            throw new NoSuchElementException("Trying to get element from the empty queue!");

        return linkedList.getFirst();
    }

    @Override
    public T peek() {
        if (linkedList.isEmpty())
            return null;

        return linkedList.getFirst();
    }
}
