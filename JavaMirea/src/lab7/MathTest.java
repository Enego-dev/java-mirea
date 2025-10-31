package lab7;

public class MathTest {
    static void main() {
        var math = new MathFunc();
        IO.println(math.pow(5, 2));
        IO.println(math.absComplex(4, 3));
        IO.println(MathCalculable.MathPI());
    }
}
