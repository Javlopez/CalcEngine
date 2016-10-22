package com.javlopez.calcengine;

/**
 * Created by jlopez on 10/21/16.
 */
public class Subtracter extends CalculateBase {

    //public Subtracter() { }

    public Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
