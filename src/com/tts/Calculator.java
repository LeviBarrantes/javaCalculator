package com.tts;

import java.util.*;

public  class Calculator {
    private int solution;
    private static int num1;
    private static int num2;
    private static final String sum = "+";
    private static final String subt = "-";
    private static final String mult = "*";
    private static final String div = "/";
    static Scanner operators;

    public Calculator(int num1) {
        this.num1 = num1;
    }

    private enum operation {
        sum, subt, mult, div
    }
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public static int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Calculator() {
        solution = 0;
        operators = new Scanner(System.in);

    }
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public int subtract(int num1, int num2)
    {
        return num1 - num2;
    }

    public int multiply(int num1, int num2)
    {
        return num1 * num2;
    }
    public int divide(int num1, int num2)
    {
        solution = num1 / num2;
        return solution;
    }

    static class MagicCalculator extends Calculator{
        MagicCalculator(int num1, int num2){
            super(num1,num2);
        }

        public MagicCalculator(int num1) {
            super(num1);
        }


        public int square() {
            int num1 = super.getNum1();
            int  num2 = super.getNum2();
            return (int) Math.pow(num1,num2);
        }

        public int factorial(int num1)
        {
            if (num1 == 0 )
                return 1;
            else
                return(num1 * factorial(num1-1));
        }


        public int sqrtNum1()
        {
            int num1 = super.getNum1();

            return (int) Math.sqrt(num1);
        }

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Insert 2 numbers");

        System.out.println("operand 1: ");

        calc.setNum1(Integer.parseInt(operators.next()));

        System.out.println("operand 2: ");
        calc.setNum2(Integer.parseInt(operators.next()));

        System.out.println("What operation? ('sum', 'subt2', 'mult', 'div')");
        operation mathOperations = operation.valueOf(operators.next());
        int output = 0 ;

        switch(mathOperations){
            case sum:
                output = calc.add(calc.getNum1(), calc.getNum2());

                break;
            case subt:
                output = calc.subtract(calc.getNum1(), calc.getNum2());

                break;
            case mult:
                output = calc.multiply(calc.getNum1(), calc.getNum2());

                break;
            case div:
                output = calc.divide(calc.getNum1(), calc.getNum2());

                break;
        }
        System.out.println("output ="+output);

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a # to get the square and factorial  #: ");
        int n1 = s.nextInt();

        MagicCalculator cal = new MagicCalculator(n1);

        System.out.println("The square is : " + cal.sqrtNum1());
        System.out.println("The factorial is : " + cal.factorial(num1));

        System.out.println ("Enter angle in degrees to obtain the sin, cosine and tangent  :");
        double degree = s.nextDouble();
        double radians = Math.toRadians (degree);
        System.out.println("The sin is : " +  Math.sin (radians));
        System.out.println("The cosine  is : " + Math.cos (radians));
        System.out.println("The tangent is : " + Math.tan (radians));







    }
    }







