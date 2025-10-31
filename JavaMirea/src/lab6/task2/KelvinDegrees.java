package lab6.task2;

public class KelvinDegrees implements Convertable{
    @Override
    public double convert(double celsiusDegrees) {
        return celsiusDegrees + 273;
    }
}
