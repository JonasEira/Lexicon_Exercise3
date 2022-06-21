package org.example;

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

}
