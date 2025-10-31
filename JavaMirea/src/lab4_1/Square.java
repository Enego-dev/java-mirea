package lab4_1;

public class Square extends Shape{
    private float a;

    public Square(float a){
        this.a = a;
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a='" + a + "'" +
                "}";
    }
}
