package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Modul 6.Wprowadzenie do testowania oprogramowania");

        Calculator result= new Calculator(50,20);

        int addition = result.addAToB();
        if (addition==(50+20)){
            System.out.println ("Addition test positive");
        }else {
            System.out.println("Addition test error");
        }

        int substraction = result.substractAFromB();
        if (substraction==(50-20)){
            System.out.println ("Substraction test positive");
        }else {
            System.out.println("Substraction test error");
        }
    }
}
