package com.javlopez.calcengine;

/**
 * Created by jlopez on 9/20/16.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;


    public void setLeftValue(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getLeftVal(){
        return leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public char getOpCode(){
        return opCode;
    }

    public double getResult() {
        return result;
    }

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(){

            switch (opCode) {
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'd':
                    result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                    break;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                default:
                    System.out.println("Invalid OpCode");
                    result = 0.0d;
                    break;
            }

    }

}
