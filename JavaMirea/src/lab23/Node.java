package lab23;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
    }

    public void addNext(Node<T> node){
        next = node;
    }

    public void deleteNext(){
        next = null;
    }

    public boolean hasNext(){
        return next != null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
