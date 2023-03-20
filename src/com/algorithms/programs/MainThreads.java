
package com.algorithms.programs;

import java.util.Scanner;

public class MainThreads extends Thread
{
    public static void main(final String[] args) {
        System.out.println("Enter the number to get the square value: ");
        final Scanner scan = new Scanner(System.in);
        final int input = scan.nextInt();
        try {
            final Threads1 t1 = new Threads1();
            t1.start();
            final Threads2 t2 = new Threads2(input);
            t2.start();
            final Threads3 t3 = new Threads3(input);
            t3.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();
    }
}