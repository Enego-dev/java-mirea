package lab2.circles;

public class CircleTest {
    public static void main(String[] args) {
        var c1 = new Circle();
        var c2 = new Circle(5);

        c1.setRadius(3);
        System.out.println("Радиус c1 = " + c1.getRadius());
        System.out.println("Диаметр c1 = " + c1.getDiameter());
        System.out.println("Длина c1 = " + c1.getLength());
        System.out.println("Площадь c1 = " + c1.getArea());

        System.out.println("Сравним c1 и c2, их радиусы 3 и 5 соответственно");
        System.out.println(c1.compareWith(c2));

        System.out.println("Установим c1 радиус 5");
        c1.setRadius(5);

        System.out.println("Сравним c1 и c2, их радиусы 5 и 5 соответственно");
        System.out.println(c1.compareWith(c2));
    }
}
