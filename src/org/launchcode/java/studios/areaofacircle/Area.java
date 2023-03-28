package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner jupiter = new Scanner(System.in);
        double radius = 0;
        while (radius <= 0) {
            System.out.println("Enter a radius: ");
            radius = jupiter.nextInt();
            if (radius <= 0) {
                System.err.println("Negative numbers are invalid.");
            } else {
                double answer = Circle.getArea(radius);
                System.out.println("The area of a circle of radius "
                        + radius + " is " + answer);
            }
        }
    }
}
