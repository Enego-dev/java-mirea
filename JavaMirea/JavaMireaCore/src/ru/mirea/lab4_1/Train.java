package ru.mirea.lab4_1;

public class Train extends Vehicle{
    private final int wagons; // количество вагонов

    public Train(String name, double speed, double costPerKm, double capacity,
                 int passengerCapacity, int wagons) {
        super(name, speed, costPerKm, capacity, passengerCapacity);
        this.wagons = wagons;
    }

    @Override
    public double calculateTime(double distance) {
        return (distance / speed) + 0.5; // +0.5 часа на маневры
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > passengerCapacity) {
            throw new IllegalArgumentException("Превышена вместимость поезда");
        }
        return distance * costPerKm * (passengers / 50.0); // стоимость зависит от заполнения
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        if (weight > capacity) {
            throw new IllegalArgumentException("Превышена грузоподъемность поезда");
        }
        return distance * costPerKm * (weight / capacity) * wagons;
    }

    public int getWagons() {
        return wagons;
    }
}
