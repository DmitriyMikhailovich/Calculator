package com.company;

public class Model {
    public double calculator (double a, double b, String operator) {
        switch (operator){
            case "+":
                a += b;
                break;
            case "-":
                a -= b;
                break;
            case "*":
                a *= b;
                break;
            case "/":
                a /= b;
                break;
        }
        return a;
    }
}
