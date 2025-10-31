package lab6.task2;

public class ConvertableTest {
    static void main() {
        var degrees = 30d;
        var toKelvin = new KelvinDegrees();
        var toFahrenheit = new FahrenheitDegrees();

        IO.println(degrees);
        IO.println(toKelvin.convert(degrees));
        IO.println(toFahrenheit.convert(degrees));
    }
}
