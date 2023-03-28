package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner jupiter = new Scanner(System.in);
        System.out.println("What's your name? ");
        String myName = jupiter.nextLine();
        System.out.println("Hello, " + myName + '!');
        System.out.println("What's your age? ");
        int myAge = jupiter.nextInt();
        System.out.println("I am " + myAge + '!');
    }

}
