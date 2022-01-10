package ua.com.foxminded.carmanager;

public class PassengerCar extends Car {

    public PassengerCar(String model, int manufacYr, int price, int weight, Color color) {
        super(model, manufacYr, price, weight, color);
    }

    @Override
    public void maintenanceNeeded(int lMaintDistance) {
        if (lMaintDistance > 10_000) System.out.println("Status: maintenance needed.");
        else System.out.println("Status: OK.");
    }

    @Override
    public void addDistance() {

    }
}
