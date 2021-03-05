package com.gmail.ncs.sapi;

public class SimpleCalculator {

    int number1;
    int number2;

    // this is a welcome message to practice how to create / use static method
    static void welcomeMessage(){
        System.out.println("Hello this is a simple calculator. Have FUN!");
    }

    public SimpleCalculator(int a, int b){
        number1 = a;
        number2 = b;
    }
}
