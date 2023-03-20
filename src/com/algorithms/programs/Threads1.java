package com.algorithms.programs;

import java.util.Random;

public class Threads1 extends Thread
{
    Random randomNumber;
    
    public Threads1() {
        this.randomNumber = new Random();
    }
    
    @Override
    public void run() {
        System.out.println("Thread currently running is: " + Thread.currentThread().getName());
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep(500L);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("At " + i + " Random number is: " + this.randomNumber.nextInt());
        }
    }
}