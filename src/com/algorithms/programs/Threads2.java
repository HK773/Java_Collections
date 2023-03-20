package com.algorithms.programs;

public class Threads2 extends Thread
{
    int numberInput;
    
    public Threads2(final int input) {
        this.numberInput = input;
    }
    
    @Override
    public void run() {
        final int result = this.numberInput * this.numberInput;
        System.out.println("Square value is: " + result);
    }
}