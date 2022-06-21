package org.example;

import java.util.Scanner;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(){

    }
    public Rectangle(double v, double v1) {
        setHeight(v);
        setWidth(v1);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Width of rectangle:");
        double width = s.nextDouble();
        System.out.println("Enter Height of rectangle:");
        double height = s.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("The area is: " + rect.getArea());
    }
}
