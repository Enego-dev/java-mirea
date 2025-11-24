package lab17.lists;

class CircularLinkedList<T> {
    private CircularNode<T> tail; // храним хвост, чтобы быстро добавлять
    private int size;

    public CircularLinkedList() {
        tail = null;
        size = 0;
    }

    public void createEmpty() {
        tail = null;
        size = 0;
    }

    public void add(T data) {
        CircularNode<T> newNode = new CircularNode<>(data);

        if (isEmpty()) {
            tail = newNode;
            tail.next = tail; // замыкаем на себя
        } else {
            newNode.next = tail.next; // новый указывает на голову
            tail.next = newNode;       // старый хвост указывает на новый
            tail = newNode;            // обновляем хвост
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;

        if (size == 1) {
            tail = null;
        } else {
            CircularNode<T> current = tail;
            // Находим элемент ПЕРЕД удаляемым
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            // Если удаляем голову
            if (index == 0) {
                tail.next = current.next.next;
            }
            // Если удаляем хвост
            else if (index == size - 1) {
                current.next = tail.next;
                tail = current;
            }
            // Удаляем из середины
            else {
                current.next = current.next.next;
            }
        }
        size--;
        return true;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        CircularNode<T> current = tail.next; // начинаем с головы
        int index = 0;
        do {
            System.out.println(index + ": " + current.data);
            current = current.next;
            index++;
        } while (current != tail.next); // пока не вернемся к голове
    }

    public void clear() {
        createEmpty();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;

        CircularNode<T> current = tail.next; // начинаем с головы
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public void displayCircular(int cycles) {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        System.out.println("Демонстрация кольцевого обхода (" + cycles + " циклов):");
        CircularNode<T> current = tail.next; // начинаем с головы
        int count = 0;

        for (int i = 0; i < cycles * size; i++) {
            System.out.println("Шаг " + count + ": " + current.data);
            current = current.next;
            count++;
            if (count % size == 0) {
                System.out.println("--- Конец цикла " + (count / size) + " ---");
            }
        }
    }
}