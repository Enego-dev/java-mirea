package ru.mirea.lab4_1;

public class Ship extends Vehicle{
    private double portFee; // портовый сбор

    public Ship(String name, double speed, double costPerKm, double capacity,
                int passengerCapacity, double portFee) {
        super(name, speed, costPerKm, capacity, passengerCapacity);
        this.portFee = portFee;
    }

    @Override
    public double calculateTime(double distance) {
        return (distance / speed) * 1.1; // +10% на погодные условия
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > passengerCapacity) {
            throw new IllegalArgumentException("Превышена вместимость корабля");
        }
        return (distance * costPerKm * passengers) + portFee;
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        if (weight > capacity) {
            throw new IllegalArgumentException("Превышена грузоподъемность корабля");
        }
        return (distance * costPerKm * weight) + portFee;
    }

    public double getPortFee() {
        return portFee;
    }
}
