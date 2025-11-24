package lab17.lists;

class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void createEmpty() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;

        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            DoublyNode<T> current = getNode(index);
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return true;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        DoublyNode<T> current = head;
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
        return getNode(index).data;
    }

    private DoublyNode<T> getNode(int index) {
        if (index < 0 || index >= size) return null;

        DoublyNode<T> current;
        if (index < size / 2) {
            // Ищем с начала
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            // Ищем с конца
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public int size() {
        return size;
    }
}
