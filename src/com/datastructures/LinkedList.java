package com.datastructures;

public class LinkedList
{
    LinkNode head;
    
    public void printList() {
        for (LinkNode n = this.head; n != null; n = n.next) {
            System.out.println(String.valueOf(n.data) + " ");
        }
    }
}