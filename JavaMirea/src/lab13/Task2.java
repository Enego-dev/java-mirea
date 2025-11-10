package lab13;

public class Task2 {
    static void main() {
        var person1 = new Person("Узбеков");
        var person2 = new Person("Улумбек", "Таджиков", "Тагилович");

        IO.println(person1.getShortName());
        IO.println(person2.getShortName());
    }
}
