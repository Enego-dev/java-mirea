package lab6.task4;

public class Book implements Printable{
    private final String author;
    private final String name;
    private final int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга \"%s\", которую написал %s в %d\n", author, name, year);
    }
}
