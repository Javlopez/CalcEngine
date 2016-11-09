package com.javlopez.calcengine;

/**
 * Created by jlopez on 11/8/16.
 */
public class PowerOf implements MathProcessing {
    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
