package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner jupiter = new Scanner(System.in);
        double radius = 0;
        do {
            System.out.println("Enter a radius or 0 to stop: ");
            radius = jupiter.nextDouble();
            if (radius < 0) {
                System.err.println("Negative numbers are invalid.");
            } else {
                if (radius == 0) { break;}
                double answer = Circle.getArea(radius);
                System.out.println("The area of a circle of radius "
                        + radius + " is " + answer);
                }
            } while (radius != 0);
        }
}
