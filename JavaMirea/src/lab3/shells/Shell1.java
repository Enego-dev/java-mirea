package lab3.shells;

import java.util.Random;

public class Shell1 {
    public static void main(String[] args) {
        var random = new Random();

        // 1. Создайте объекты класса Double, используя методы valueOf().
        for (int i = 0; i < 10; i++) {
            var str = String.valueOf(random.nextDouble(0, 10));
            var dbl = Double.valueOf(str);
            System.out.println(dbl.getClass() + ": " + dbl);
        }



        // 2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            var str = String.valueOf(random.nextDouble(0, 10));
            var dbl = Double.parseDouble(str);
            System.out.println(dbl);
        }




        // 3. Преобразование к примитивным типам
        System.out.println("\n");

        var newDouble = 1255125.66236d;
        var newByte = (byte) newDouble;
        var newShort = (short) newDouble;
        var newInt = (int) newDouble;
        var newLong = (long) newDouble;
        var newFloat = (float) newDouble;
        System.out.println(newByte);
        System.out.println(newShort);
        System.out.println(newInt);
        System.out.println(newLong);
        System.out.println(newFloat);

        // 4. Вывести значение того самого дабл в консоль
        System.out.println(newDouble);

        // 5. Преобразовать литерал дабл в строку
        String d = Double.toString(3.14);
        System.out.println("\n" + d);
    }
}
