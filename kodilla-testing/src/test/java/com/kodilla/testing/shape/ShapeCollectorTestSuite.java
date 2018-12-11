package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
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
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> figuresList = new ArrayList<>();
        figuresList.add(circle);
        figuresList.remove(circle);
        //when
        boolean figureRemoved=shapeCollector.removeFigure(circle);
        //then
        Assert.assertFalse(figureRemoved);
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
