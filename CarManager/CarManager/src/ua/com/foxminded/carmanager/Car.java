package ua.com.foxminded.carmanager;

import java.util.Objects;

public abstract class Car implements Serviceable {
    protected int lMaintDistance = 0;
    String model;
    int manufacYr;
    int price;
    int weight;
    Color color;
    private double distance = 0;

    public Car(String model, int manufacYr, int price, int weight, Color color) {
        this.model = model;
        this.manufacYr = manufacYr;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void showInfo() {
        System.out.println("Model: " + model + ", " + "Manufactured: " + manufacYr + ", "
                + "Price: " + price + ", " + "Weight: " + weight + ", " + "Color: " + color + ".");
    }

//    public void addDistance(int additionalDistance) {
//        if (additionalDistance < 0) {
//            throw new ArithmeticException("Error: Cannot be negative.");
//        } else distance += additionalDistance;
//    }

    public void addDistance(double additionalDistance) {
        if (additionalDistance < 0) throw new ArithmeticException("Error: Cannot be negative.");
        distance += additionalDistance;
        lMaintDistance += additionalDistance;
    }

    public void maintenance() {
        lMaintDistance = 0;
    }

    double getDistance() {
        return distance;
    }

    public int getlMaintDistance() {
        return lMaintDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacYr == car.manufacYr && price == car.price && weight == car.weight && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacYr, price, weight, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "lMaintDistance=" + lMaintDistance +
                ", distance=" + distance +
                '}';
    }
}
