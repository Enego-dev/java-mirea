package lab4_1;

public class VehicleTest {
    static void main(String[] args) {
        Vehicle[] transports = {
                new Car("Грузовик Volvo", 80, 2.5, 20, 3, 25),
                new Airplane("Боинг 737", 800, 15, 50, 180, 5000),
                new Train("Грузовой поезд", 60, 1.2, 2000, 0, 20),
                new Ship("Грузовое судно", 30, 0.8, 10000, 50, 10000)
        };

        double distance = 500;
        int passengers = 5;
        double cargoWeight = 25;

        System.out.println("Сравнение транспортных средств на расстоянии " + distance + " км");
        System.out.println("Пассажиров: " + passengers + ", Груза: " + cargoWeight + " тонн");
        System.out.println("==================================================");

        for (Vehicle transport : transports) {
            try {
                System.out.println("\n" + transport.getName() + ":");

                double time = transport.calculateTime(distance);
                double passengerCost = transport.calculatePassengerCost(distance, passengers);
                double cargoCost = transport.calculateCargoCost(distance, cargoWeight);

                System.out.printf("Время в пути: %.2f часов%n", time);
                System.out.printf("Стоимость перевозки пассажиров: %.2f руб%n", passengerCost);
                System.out.printf("Стоимость перевозки груза: %.2f руб%n", cargoCost);

            } catch (IllegalArgumentException e) {
                System.out.println("Невозможно выполнить перевозку: " + e.getMessage());
            }
        }
    }
}
