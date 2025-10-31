package lab6.task2;

public class FahrenheitDegrees implements Convertable {

    @Override
    public double convert(double celsiusDegree) {
        return celsiusDegree * 1.8d + 32;
    }
}
