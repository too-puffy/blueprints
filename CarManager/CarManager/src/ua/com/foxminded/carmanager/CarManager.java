package ua.com.foxminded.carmanager;

public class CarManager {

    public static void main(String[] args) {
        PassengerCar pcar1 = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
        PassengerCar pcar2 = new PassengerCar("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        PassengerCar pcar3 = new PassengerCar("BMW X5", 2015, 7865, 1500, Color.BLACK);

        Bus bus1 = new Bus("Ikarus", 1987, 9000, 30000, Color.ORANGE);
        Bus bus2 = new Bus("Ikarus", 1987, 9000, 30000, Color.ORANGE);

        pcar1.addDistance(100500);
        pcar1.addDistance(1);
        pcar1.addDistance(0.33);

        pcar2.addDistance(5000);

        pcar3.addDistance(424242);
        pcar3.maintenance();

        bus1.addDistance(16000);
        System.out.println();

        pcar1.showInfo();
        System.out.println(pcar1);
        pcar1.maintenanceNeeded(pcar1.lMaintDistance);
        System.out.println();

        pcar2.showInfo();
        System.out.println(pcar2);
        pcar1.maintenanceNeeded(pcar2.lMaintDistance);
        System.out.println();

        pcar3.showInfo();
        System.out.println(pcar3);
        pcar1.maintenanceNeeded(pcar3.lMaintDistance);
        System.out.println();

        bus1.showInfo();
        System.out.println(bus1);
        pcar1.maintenanceNeeded(bus1.lMaintDistance);
        System.out.println();

        System.out.println(pcar1.equals(pcar2));
        System.out.println(pcar1.equals(pcar3));
        System.out.println(pcar2.equals(pcar3));
        System.out.print(bus1.equals(bus2));
        System.out.println();
    }
}
