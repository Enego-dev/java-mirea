package lab4_1;

public abstract class Vehicle {
    protected String name;
    protected double speed; // км/ч
    protected double costPerKm; // стоимость за км
    protected double capacity; // грузоподъемность в тоннах
    protected int passengerCapacity; // вместимость пассажиров

    public Vehicle(String name, double speed, double costPerKm, double capacity, int passengerCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
        this.capacity = capacity;
        this.passengerCapacity = passengerCapacity;
    }

    // Абстрактные методы для перевозки
    public abstract double calculateTime(double distance);
    public abstract double calculatePassengerCost(double distance, int passengers);
    public abstract double calculateCargoCost(double distance, double weight);

    // Общие методы
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
