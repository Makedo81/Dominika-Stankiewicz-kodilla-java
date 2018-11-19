package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figuresCollection = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
     public void addFigure(Shape shape){

         figuresCollection.add(shape);
     }
    public Shape removeFigure(Shape shape) {

    }

    public int getFigure(int n){

    }

    public Shape showFigures(){

    }
}