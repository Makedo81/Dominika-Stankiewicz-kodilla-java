package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector(circle);
        ArrayList<Shape> figuresCollection = new ArrayList<>();
        //when
        figuresCollection.addFigure(new Circle(5));
        //then
        Assert.assertEquals(1,figuresCollection.size());
    }
    @Test
    public void testRemoveFigure() {
        //given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector(circle);
        ArrayList<Shape> figuresCollection = new ArrayList<>();
        //when
        figuresCollection.addFigure(new Circle(5));
        boolean result = figuresCollection.remove(new Circle(5));
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0,figuresCollection.size());
    }
    @Test
    public void testGetFigure(){
        //given
        Shape circle = new Circle(5);
        Shape circle = new Circle(3);
        ShapeCollector collector = new ShapeCollector(circle);
        ArrayList<Shape> figuresCollection = new ArrayList<>();
        figuresCollection.addFigure(new Circle(5));
        figuresCollection.addFigure(new Circle(3));
        //when
        Shape figure = figuresCollection.getFigure(1);
        //then
        //Assert.assertEquals(figuresCollection.get(0),figure);
        Assert.assertEquals(("circle",28.26),figure);//????

    }
    @Test
    public void testShowFigure(){
        //given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector(circle);
        ArrayList<Shape> figuresCollection = new ArrayList<>();
        figuresCollection.addFigure(circle);
        //when
        Shape figureToShow = figuresCollection.showFigure()//iteracja for each wyswietlajaca figury
        //then
        //Assert.assertEquals(figuresCollection.get(0),figure);
        Assert.assertEquals(("circle",78.5),new Circle(5));

    }

} */
