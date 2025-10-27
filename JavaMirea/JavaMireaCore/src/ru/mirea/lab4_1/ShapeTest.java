package ru.mirea.lab4_1;

public class ShapeTest {
    static void main(String[] args) {
        var circle = new Circle(5);
        IO.println(circle.toString());
        IO.println(circle.getType());
        IO.println(circle.getArea());
        IO.println(circle.getPerimeter());

        var rectangle = new Rectangle(5, 2);
        IO.println(rectangle.toString());
        IO.println(rectangle.getType());
        IO.println(rectangle.getArea());
        IO.println(rectangle.getPerimeter());

        var square = new Square(5);
        IO.println(square.toString());
        IO.println(square.getType());
        IO.println(square.getArea());
        IO.println(square.getPerimeter());
    }
}
