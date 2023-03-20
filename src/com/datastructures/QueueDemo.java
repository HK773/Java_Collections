package com.datastructures;

public class QueueDemo
{
    public static void main(final String[] args) {
         Queue queue = new Queue(1000);
        queue.insertValueToQueue(10);
        queue.insertValueToQueue(21);
        queue.insertValueToQueue(30);
        System.out.println("Queue element removed is: " + queue.deleteValueFromQueue());
    }
}