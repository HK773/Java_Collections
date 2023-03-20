package com.algorithms.programs;

import java.util.Scanner;

public class Stack
{
    int size;
    int top;
    int[] arr;
    
    Stack( int countsize) {
        this.top = -1;
        this.arr = new int[countsize];
    }
    
    public static void main( String[] args) {
        try {
             Scanner scan = new Scanner(System.in);
            boolean on = true;
            System.out.println("Enter the max size of the stack");
             int input = scan.nextInt();
             Stack stack = new Stack(input);
            do {
                System.out.println("1.Push 2.Pop 3.Display 4.Exit");
                System.out.println("Enter Value between 1-4: ");
                 int option = scan.nextInt();
                switch (option) {
                    default: {
                        continue;
                    }
                    case 1: {
                        System.out.println("Enter the push item: ");
                        stack.pushItem(scan.nextInt());
                        continue;
                    }
                    case 2: {
                        stack.popItem();
                        continue;
                    }
                    case 3: {
                        stack.displayStack();
                        continue;
                    }
                    case 4: {
                        on = false;
                        System.out.println("Exit");
                        continue;
                    }
                }
            } while (on);
            scan.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void displayStack() {
        System.out.println("Displays the stack");
        if (this.top < 0) {
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i < this.arr.length; ++i) {
                System.out.println(this.arr[i]);
            }
        }
    }
    
    public void popItem() {
        System.out.println("Removes stack element from top of the stack");
        if (this.top < 0) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Element is popped out: " + this.arr[this.top--]);
        }
    }
    
    public void pushItem( int item) {
        System.out.println("Adds new value on top of the stack");
        if (this.top == this.arr.length - 1) {
            System.out.println("Stack is full");
        }
        else {
            this.arr[++this.top] = item;
            System.out.println("Pushed new element: " + this.arr[this.top]);
        }
    }
}