package lab6.task4;

public class PrinteableTest {
    static void main() {
        var shop1 = new Shop("Музылев Николай Викторович", "Проспект Вернадского 78", 1);
        var shop2 = new Shop("Фролова Ольга Алексеевна", "Пироговская хз какая", 999);
        var shop3 = new Shop("Кто Кто Кто", "НЕизвестная 25", 0);
        var book1 = new Book("Лермонтов М.Ю.", "Герой нашего времени", 1878);
        var book2 = new Book("Михаил Булгаков", "Мастер и Маргарита", 1940);
        var book3 = new Book("Преступление и наказание", "Федор Достоевский", 1866);

        Printable[] printables = new Printable[]{shop1, shop2, shop3, book1, book2, book3};
        for (var printable : printables){
            printable.print();
        }
    }
}
