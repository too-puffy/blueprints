package ua.com.foxminded.carmanager;

public class Combine implements Serviceable {

    protected int lMaintDistance = 0;
    String model;
    int manufacYr;
    int price;
    int weight;
    Color color;
    private double distance = 0;

    public Combine(String model, int manufacYr, int price, int weight, Color color) {
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

    public void addDistance(double additionalDistance) {
        if (additionalDistance < 0) throw new ArithmeticException("Error: Cannot be negative.");
        distance += additionalDistance;
        lMaintDistance += additionalDistance;
    }



    public int getlMaintDistance() {
        return lMaintDistance;
    }

    @Override
    public void maintenanceNeeded(int lMaintDistance) {
        if (lMaintDistance > 60_000) System.out.println("Status: maintenance needed.");
        else System.out.println("Status: OK.");
    }

    @Override
    public void addDistance() {
    }

    public String toString() {
        return "Car{" +
                "lMaintDistance=" + lMaintDistance +
                ", distance=" + distance +
                '}';
    }
}
