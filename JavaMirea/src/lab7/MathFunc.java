package lab7;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(int a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double absComplex(int x, int y) {
        return Math.abs(Math.sqrt(x*x + y*y));
    }
}
