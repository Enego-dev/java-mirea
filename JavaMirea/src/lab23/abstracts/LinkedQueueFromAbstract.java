package lab23.abstracts;

import lab23.Node;

public class LinkedQueueFromAbstract<T> extends AbstractQueue<T>{
    private Node<T> first = null;
    private Node<T> last = null;

    public LinkedQueueFromAbstract(){
    }

    public LinkedQueueFromAbstract(int capacity){
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
