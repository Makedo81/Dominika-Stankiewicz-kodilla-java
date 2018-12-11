package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

     Shape shape;
     ArrayList<Shape> figuresCollection = new ArrayList<>() ;
   //  ArrayList<Shape> figureToShow= new ArrayList<>();

    public ShapeCollector() {

        this.shape = shape;
    }

    public ArrayList<Shape> addFigure(Shape shape){

         figuresCollection.add(shape);
         return figuresCollection;
     }
    public boolean removeFigure(Shape shape){
        boolean figureRemoved =false;
            if(figuresCollection.contains(shape)){
            figuresCollection.remove(shape);
            figureRemoved = true;
        }
            return figureRemoved;
    }

    public Shape getFigure(int n){
        Shape figure = figuresCollection.get(n);
        return figure;
    }
    public ArrayList<Shape> showFigures() {
        ArrayList<Shape> figureToShow= new ArrayList<>();
        for (Shape figure : figuresCollection){
            figureToShow.add(figure);
        }
        return figureToShow;
    }
}