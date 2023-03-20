package com.datastructures;

public class LinkedListDemo extends LinkedList
{
    public static void main( String[] args) {
         LinkedListDemo list = new LinkedListDemo();
        list.head = new LinkNode(7);
         LinkNode second = new LinkNode(9);
         LinkNode third = new LinkNode(13);
        list.head.next = second;
        second.next = third;
        third.next = null;
        list.printList();
    }
}