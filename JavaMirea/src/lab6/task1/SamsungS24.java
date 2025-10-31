package lab6.task1;

public class SamsungS24 implements Priceable{
    final float dollarPrice = 550;

    @Override
    public float getPrice() {
        return 550 * 85 + 5000; // курс доллара и пошлина
    }
}
