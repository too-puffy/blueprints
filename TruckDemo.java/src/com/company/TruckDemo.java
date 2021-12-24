package com.company;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {return passengers;}
    void setPassengers(int p) {passengers = p;}
    int getFuelcap() {return  fuelcap;}
    void setFuelcap(int f) {fuelcap = f;}
    int getMpg() {return mpg;}
    void setMpg(int m) {mpg = m;}
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargo() {return cargocap;}
    void setCargocap(int c) {cargocap = c;}
}

class OffRoad extends Vehicle {
    private int groundClearance;

    OffRoad(int p, int f, int m, int c) {
        super(p, f, m);
    }
    int groundClearance() {return groundClearance;}
    void groundClearance(int gc) {groundClearance = gc;}
}

class TruckDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println ( "A minivan can carry " +
                minivan.getPassengers() + "ppl.");
        System.out.println ( "To travel " + dist +
                "mi. it takes " + gallons +
                "gal. of fuel. \n");

        gallons = sportcar.fuelneeded(dist);
        System.out.println ( "A sportcar can carry " +
                sportcar.getPassengers() + "ppl.");
        System.out.println ( "To travel " + dist +
                "mi. it takes " + gallons +
                "gal. of fuel. \n");

        gallons = semi.fuelneeded(dist);
        System.out.println ( "A semi-trailer truck can carry " +
                semi.getCargo() + "lb.");
        System.out.println ( "To travel " + dist +
                "mi. it takes " + gallons +
                "gal. of fuel. \n");

        gallons = pickup.fuelneeded (dist);
        System.out.println ( "A pickup truck can carry " +
                pickup.getCargo() + "lb.");
        System.out.println ( "To travel " + dist +
                "mi. it takes " + gallons +
                "gal. of fuel.");

    }
}
