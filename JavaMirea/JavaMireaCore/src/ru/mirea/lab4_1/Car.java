package ru.mirea.lab4_1;

public class Car extends Vehicle{
    private final double fuelCost;

    public Car(String name, double speed, double costPerKm, double capacity, int passengerCapacity, double fuelCost){
        super(name, speed, costPerKm, capacity, passengerCapacity);
        this.fuelCost = fuelCost;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > passengerCapacity)
            throw new IllegalArgumentException("Превышено кол-во пассажиров");

        return distance * costPerKm * passengers + fuelCost;
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        if (weight > capacity)
            throw new IllegalArgumentException("Превышена грузоподъемность автомобиля");

        return distance * costPerKm * (1 + weight / capacity);
    }
}
