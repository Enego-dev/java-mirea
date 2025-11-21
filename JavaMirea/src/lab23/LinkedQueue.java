package lab23;

public class LinkedQueue<T> implements Queue<T>{
    private Node<T> first;
    private Node<T> last;
    private int size;
    private final int CAPACITY;

    public LinkedQueue(){
        first = null;
        last = null;
        size = 0;
        CAPACITY = -1;
    }

    public LinkedQueue(int capacity){
        first = null;
        last = null;
        size = 0;
        CAPACITY = capacity;
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull())
            return false;

        var newNode = new Node<>(t);

        if (isEmpty()){
            first = last = newNode;
            size++;
            return true;
        }

        last.next = newNode;
        last = newNode;
        size++;
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            return null;

        var firstData = first.data;
        if (size == 1){
            first = last = null;
            size--;
            return firstData;
        }

        first = first.next;
        size--;
        return firstData;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : first.data;
    }

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

    @Override
    public void display() {
        if (isEmpty()){
            IO.println("Очередь пуста!");
            return;
        }

        var node = first;
        while (node != null){
            IO.println(node);
            node = node.next;
        }
    }
}
