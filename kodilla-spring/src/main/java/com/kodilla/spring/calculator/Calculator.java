package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Calculator {

    public Calculator(Display display) {
        this.display = display;
    }

    @Autowired
    Display display;

    public double add(double a, double b){
        display.displayValue(a);
        display.displayValue(b);
        double sum = a+b;
        display.displayValue(sum);
        return sum;
    }
    public double sub(double a, double b){
        display.displayValue(a);
        display.displayValue(b);
        double sub = a-b;
        display.displayValue(sub);
        return sub;
    }
    public double mul(double a,double b){
        display.displayValue(a);
        display.displayValue(b);
        double mul = a*b;
        display.displayValue(mul);
        return mul;
    }
    public double div(double a, double b){
        display.displayValue(a);
        display.displayValue(b);
        double div = a/b;
        display.displayValue(div);
        return div;
    }
}