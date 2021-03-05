package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
	// call welcomeMessage from SimpleCalculator Class
    SimpleCalculator.welcomeMessage();
    // make an addition
    SimpleCalculator first = new SimpleCalculator(4, 7);
        System.out.println(first.number1 + first.number2);
    }
}
