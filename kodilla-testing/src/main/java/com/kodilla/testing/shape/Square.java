package com.kodilla.testing.shape;

public class Square implements Shape {

    double sideLength;
    double field;
    String name;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.field = getField();
        this.name = getName();
    }

    public String getName() {
        return "Square";
        //System.out.println("square");
    }

    public double getField() {
        field = sideLength*sideLength;
        return field;
    }
}
