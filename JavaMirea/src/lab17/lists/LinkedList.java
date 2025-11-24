package lab17.lists;

class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void createEmpty() {
        head = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;

        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        Node<T> current = head;
        int index = 0;
        while (current != null) {
            System.out.println(index + ": " + current.data);
            current = current.next;
            index++;
        }
    }

    public void clear() {
        createEmpty();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }
}
