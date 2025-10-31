package lab6.task1;

public class PriceableTest {
    static void main() {
        var priceables = new Priceable[]{new SamsungS24(), new PocoX7Pro()};
        for (var priceable : priceables){
            IO.println("Цена - " + priceable.getPrice() + "руб");
        }
    }
}
