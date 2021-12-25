package ua.com.foxminded.carmanager;

import java.util.Objects;

public class Car {
    String model;
    int manufacYr;
    int price;
    int weight;
    Color color;

    public Car(String model, int manufacYr, int price, int weight, Color color) {
        this.model = model;
        this.manufacYr = manufacYr;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void showInfo() {
        System.out.println(model + " " + manufacYr + " " + price + " " + weight + " " + color + ".");
    }
    //    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", manufacYr=" + manufacYr +
//                ", price=" + price +
//                ", weight=" + weight +
//                ", color='" + color + '\'' +
//                '}';

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
}
