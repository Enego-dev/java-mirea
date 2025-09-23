package ru.mirea.lab2.circles;

public class Circle {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean compareWith(Circle circle){
        return radius == circle.radius;
    }
}
