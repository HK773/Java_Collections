package com.algorithms.programs;

import java.util.Scanner;

public class ExceptionHandlingCase
{
    public static void main(final String[] args) {
        try {
            final Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value of a");
            final int a = scan.nextInt();
            System.out.println("Enter the value of b");
            final int b = scan.nextInt();
            final ExceptionHandlingCase object = new ExceptionHandlingCase();
            final int result = object.divideByCase(a, b);
            if (result != 0) {
                System.out.println(result);
            }
            else {
                System.out.println("Program Executed successfully");
            }
            scan.close();
        }
        catch (Exception ex) {}
    }
    
    public int divideByCase(final int a, final int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            final int c = a / b;
            return c;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }
}
