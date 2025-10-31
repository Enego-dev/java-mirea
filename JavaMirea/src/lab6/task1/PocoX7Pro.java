package lab6.task1;

public class PocoX7Pro implements Priceable{
    final float dollarPrice = 250;

    @Override
    public float getPrice() {
        return 250 * 85 + 2000;
    }
}
