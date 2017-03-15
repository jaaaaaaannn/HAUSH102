package com.shanie.models;

import javax.validation.constraints.NotNull;

/**
 * Created by shanie on 13/03/2017.
 */
public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private String operation;
    private String result;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}