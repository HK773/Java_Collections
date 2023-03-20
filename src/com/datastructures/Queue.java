package com.datastructures;

public class Queue
{
    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;
    
    public Queue( int capacity) {
        this.size = 10;
        this.capacity = capacity;
         int n = 0;
        this.size = n;
        this.front = n;
        this.rear = capacity - 1;
        this.arr = new int[this.capacity];
    }
    
    boolean isQueueFull( Queue queue) {
        return queue.size == queue.capacity;
    }
    
    boolean isQueueEmpty( Queue queue) {
        return queue.size == 0;
    }
    
    public void insertValueToQueue( int item) {
        if (this.isQueueFull(this)) {
            System.out.println("Queue is empty");
        }
        this.rear = (this.capacity + 1) % this.rear;
        System.out.println(String.valueOf(this.rear) + " capacity:" + this.capacity + " rear " + this.rear);
        this.arr[this.rear] = item;
        ++this.size;
        System.out.println(" Value " + item + " added");
    }
    
    public int deleteValueFromQueue() {
        if (this.isQueueFull(this)) {
            System.out.println("Queue is full");
        }
         int item = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        --this.size;
        return item;
    }
    
    int front() {
        if (this.isQueueEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    
    int rear() {
        if (this.isQueueEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.arr[this.rear];
    }
}
