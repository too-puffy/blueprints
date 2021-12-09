package com.company;
import java.util.Scanner;

public class Noise {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in); // input format is "x,x"
        System.out.println("Please, enter a value in format \"x\" or \"x,x\"");
        System.out.println("To EXIT press \"000\"");

        for (;;) {
        double time = console.nextDouble();
        double speed = 1100.0;
        double distance = time * speed / 2;
        System.out.println("Distance from  noise source equals" + " " + distance + "ft.");

            if (time == 000) break;

        }
    }
}