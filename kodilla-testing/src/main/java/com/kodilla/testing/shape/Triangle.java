package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String name;
    double sideLength;
    double hight;
    double field;

    public Triangle(double sideLength, double hight) {

        this.sideLength = sideLength;
        this.hight = hight;
        this.field = getField();
        this.name = getName();
    }

    public String getName() {
        return "Triangle";
        //System.out.println("Triangle");
    }

    public double getField() {
        return 0.5*sideLength*hight;
    }
}
