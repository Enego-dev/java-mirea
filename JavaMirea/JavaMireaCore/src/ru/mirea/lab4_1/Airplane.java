package ru.mirea.lab4_1;

public class Airplane extends Vehicle{
    private final double takeoffCost; // стоимость взлета/посадки

    public Airplane(String name, double speed, double costPerKm, double capacity,
                    int passengerCapacity, double takeoffCost) {
        super(name, speed, costPerKm, capacity, passengerCapacity);
        this.takeoffCost = takeoffCost;
    }

    @Override
    public double calculateTime(double distance) {
        return (distance / speed) + 2; // +2 часа на взлет/посадку
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > passengerCapacity) {
            throw new IllegalArgumentException("Превышена вместимость самолета");
        }
        return (distance * costPerKm * passengers) + takeoffCost;
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        if (weight > capacity) {
            throw new IllegalArgumentException("Превышена грузоподъемность самолета");
        }
        return (distance * costPerKm * weight) + takeoffCost;
    }

    public double getTakeoffCost() {
        return takeoffCost;
    }
}
