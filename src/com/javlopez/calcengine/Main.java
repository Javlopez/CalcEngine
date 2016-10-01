package com.javlopez.calcengine;

public class Main {

    public static void main(String[] args) {

        MathEquation[]  equations = new MathEquation[4];

        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);


        for(MathEquation equation: equations) {
            equation.execute();
            System.out.println("Running" + equation.getClass());
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println("===========================");
        System.out.println("Using overloads");
        System.out.println("===========================");

        double leftDoubleValue = 9.0d;
        double rightDoubleValue = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation mathEquationOverload = new MathEquation('d');
        mathEquationOverload.execute(leftDoubleValue, rightDoubleValue);
        System.out.print("result double = ");
        System.out.println(mathEquationOverload.getResult());

        mathEquationOverload.execute(leftInt, rightInt);
        System.out.print("result int = ");
        System.out.println(mathEquationOverload.getResult());

        mathEquationOverload.execute((double) leftInt, rightInt);
        System.out.print("result int = ");
        System.out.println(mathEquationOverload.getResult());
    }
}
