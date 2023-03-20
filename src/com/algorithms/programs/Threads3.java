package com.algorithms.programs;

public class Threads3 extends Thread
{
    int number;
    
    public Threads3( int input) {
        this.number = input;
    }
    
    @Override
    public void run() {
         int result = this.number * this.number * this.number;
        System.out.println("Cube value is: " + result);
    }
}