package lab17.lists;

class CircularNode<T> {
    T data;
    CircularNode<T> next;

    public CircularNode(T data) {
        this.data = data;
        this.next = this; // указывает на себя при создании
    }
}