package ua.com.foxminded.carmanager;

public class CarManager {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
        Car car2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        Car car3 = new Car("BMW X5", 2015, 7865, 1500, Color.BLACK);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
        System.out.println();

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.print(car2.equals(car3));
    }
}
