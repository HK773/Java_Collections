package com.collections.sample.queues;

import java.util.Iterator;
import java.util.ArrayDeque;

public class Dequeues
{
    public static void main( String[] args) {
         ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();
        dequeue.add(34);
        dequeue.add(343);
        dequeue.add(324);
        dequeue.add(34);
        dequeue.add(98);
        System.out.println("First Value: " + dequeue.getFirst());
        System.out.println("Last Value: " + dequeue.getLast());
        for ( Integer integer : dequeue) {
            System.out.println(integer);
        }
        
    }
}