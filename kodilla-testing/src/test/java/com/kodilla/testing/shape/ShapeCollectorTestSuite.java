package com.kodilla.testing.shape;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> figuresList = new ArrayList<>();
        figuresList.add(circle);
        //when
        ArrayList<Shape> result = shapeCollector.addFigure(circle);
        //then
        Assert.assertEquals(figuresList,result);
    }
    @Test
    public void testRemoveFigure() {
        //given
        Shape circle = new Circle(5);
        Shape circle1 = new Circle(4);
        Shape square = new Square(4);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(square);
        //when
        shapeCollector.removeFigure(circle);
        //then
        int result = shapeCollector.figuresCollection.size();
        Assert.assertEquals(2,result);

    }
    @Test
    public void testGetFigure(){
        //given
        Shape circle = new Circle(5);
        Shape circle1= new Circle (6);
        ShapeCollector shapeCollector  = new ShapeCollector();
        shapeCollector.addFigure(circle);
        // when
        Shape result = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(circle,result);
    }
    @Test
    public void testShowFigures(){
        //given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> figuresList;
        figuresList=shapeCollector.addFigure(circle);
        ArrayList<Shape> list = new ArrayList<>();
        for (Shape shape : figuresList){
            list.add(shape);
        }

        //when
        ArrayList<Shape> result = shapeCollector.showFigures();

        //then
        Assert.assertEquals(list,result);
    }
}
