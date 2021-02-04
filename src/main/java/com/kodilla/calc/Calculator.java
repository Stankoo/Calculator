package com.kodilla.calc;



public class Calculator {


    public int addiction(int a, int b) {
        int result = a + b;
        return result;
    }

    public int substraction(int a, int b) {
        int res = a - b;
        return res;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addiction(5, 7));

    }
}
