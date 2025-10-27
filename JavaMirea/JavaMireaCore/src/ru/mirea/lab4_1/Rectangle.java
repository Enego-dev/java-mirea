package ru.mirea.lab4_1;

public class Rectangle extends Shape{
    private float a;
    private float b;

    public Rectangle(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a='" + a + "'" +
                "b='" + b + "'" +
                "}";
    }
}
