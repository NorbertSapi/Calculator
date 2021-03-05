package com.gmail.ncs.sapi;

public class SimpleCalculator {

    double number1;
    double number2;

    // this is a welcome message to practice how to create / use static method
    static void welcomeMessage(){
        System.out.println("Hello this is a simple calculator. Have FUN!");
    }

    public SimpleCalculator(double a, double b){
        number1 = a;
        number2 = b;
    }
}
