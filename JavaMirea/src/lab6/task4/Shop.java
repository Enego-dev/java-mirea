package lab6.task4;

public class Shop implements Printable{
    private final String owner;
    private final String street;
    private final int availableBooks;

    public Shop(String owner, String street, int availableBooks){
        this.owner = owner;
        this.street = street;
        this.availableBooks = availableBooks;
    }

    @Override
    public void print() {
        System.out.printf("В магазине на %s есть %d книг в наличии. Владелец - %s\n", street, availableBooks, owner);
    }
}
