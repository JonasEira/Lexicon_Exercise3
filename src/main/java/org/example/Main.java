package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Pontiac", 1963, "green", 2.5);
        System.out.println(myCar.drive());


        Scanner s = new Scanner(System.in);
        System.out.println("Enter Width of rectangle:");
        double width = s.nextDouble();
        System.out.println("Enter Height of rectangle:");
        double height = s.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("The area is: " + rect.getArea());3
    }


}