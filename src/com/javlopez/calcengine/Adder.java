package com.javlopez.calcengine;

/**
 * Created by jlopez on 10/21/16.
 */
public class Adder extends CalculateBase {

    //public Adder(){}

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

}
