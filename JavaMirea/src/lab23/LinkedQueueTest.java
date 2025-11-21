package lab23;

public class LinkedQueueTest {
    static void main() {
        var queue = new LinkedQueue<Integer>();
        queue.display();
        IO.println("");

        queue.enqueue(5);
        queue.display();
        IO.println("");

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.display();
        IO.println("");

        IO.println(queue.peek());
        IO.println(queue.dequeue());
        IO.println(queue.dequeue());

        IO.println("\nПосле peek и dequeue");
        queue.display();

        IO.println("\nВытаскиваем оставшиеся 2 элемента");
        IO.println(queue.dequeue());
        IO.println(queue.dequeue());

        IO.println("\nСмотрим что при пустой очереди");
        IO.println(queue.dequeue());
    }
}
