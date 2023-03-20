package com.collections.sample.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queues
{
    public static void main( String[] args) {
         PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(33);
        priorityQueue.add(33);
        priorityQueue.add(373);
        priorityQueue.add(339);
        priorityQueue.add(123);
        System.out.println("Peek Value: " + priorityQueue.peek());
        System.out.println("Poll Value" + priorityQueue.poll());
        System.out.println("After Poll operation queue value: " + priorityQueue.peek());
        for ( Integer integer : priorityQueue) {
            System.out.println(integer);
        }
        Iterator< Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
			 System.out.println(iterator.next());
			
		}
    }
}