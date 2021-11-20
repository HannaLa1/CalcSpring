package com.application.service;

public class CalcService {

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    public double doOperation(double num1, double num2, String operation){
        double result = 0;

        switch (operation) {
            case "sum" ->
                    result = sum(num1, num2);
            case "sub" ->
                    result = sub(num1, num2);
            case "mul" ->
                    result = mul(num1, num2);
            case "div" ->
                    result = div(num1, num2);
        }

        return result;
    }
}
