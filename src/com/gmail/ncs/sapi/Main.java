package com.gmail.ncs.sapi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // call welcomeMessage from SimpleCalculator Class
        SimpleCalculator.welcomeMessage();
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        // input first number
        double num1 = sc.nextDouble();
        // input second number
        System.out.println("Please enter a second number: ");
        double num2 = sc.nextDouble();
        // make an addition
        SimpleCalculator first = new SimpleCalculator(num1, num2);
        System.out.println(first.number1 + first.number2);
    }
}
