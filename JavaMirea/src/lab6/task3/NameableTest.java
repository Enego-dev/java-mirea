package lab6.task3;

public class NameableTest {
    static void main() {
        Nameable planet = new Planet();
        Nameable car = new Car();
        Nameable phone = new Phone();
        IO.println(planet.getName());
        IO.println(car.getName());
        IO.println(phone.getName());
    }
}
