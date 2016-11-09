package com.javlopez.calcengine;

/**
 * Created by jlopez on 11/8/16.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord(); //add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
