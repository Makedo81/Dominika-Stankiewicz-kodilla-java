package com.kodilla.testing.shape;

public class Circle implements Shape {

    double pi=3.14;
    double radius;
    double field;
    String name;

    public Circle(double radius) {
        this.radius = radius;
        this.field = getField();
        this.name = getName();
    }

    @Override
    public String getName() {
        return "circle";
        //System.out.println("Circle");
    }

    @Override
    public double getField() {
        field = pi*radius*radius;
        return field;
    }
}
