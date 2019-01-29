package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(1.0,2.0);
        double mul = calculator.mul(2,3);
        //Then
        Assert.assertEquals(3.0,sum,0.01);
        Assert.assertEquals(6.0,mul,0.01);
    }

    @Test
    public void testDisplayCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(1.0,2.0);
        //Then
        display.displayValue(sum);
    }
}
