package lab23;

public class Test {
    static void main() {
        var queue = new QueueLinkedList<String>(5);
        queue.offer("Hello");
        queue.offer("Mister");
        queue.offer("President");
        queue.offer("Trump");
        queue.offer("Grrrr");
        IO.println("Queue.offer(\"BBBRRR\"): " + queue.offer("BBBRRR"));    // ожидается false, фактически false
        //queue.add("BBBRRR");  // ожидается - ошибка, фактически - ошибка

        IO.println("queue element: " + queue.element());

        IO.println("queue peek:");
        while (queue.peek() != null){
            IO.println(queue.poll());
        }

        //var f = queue.element();  // ожидается - ошибка, фактически - ошибка
        //var g = queue.remove();   // ожидается - ошибка, фактически - ошибка
    }
}
