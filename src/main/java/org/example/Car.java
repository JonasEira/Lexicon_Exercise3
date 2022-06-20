package org.example;

public class Car {
    private int id;
    private int year;
    private double motorSize;
    private String model;
    private String colour;

    public Car(String model, int year, String colour, double motorSize) {
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.motorSize = motorSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(double motorSize) {
        this.motorSize = motorSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String drive() {
        return model + " with motorSize " + motorSize +
                " can drive now.";
    }
}
