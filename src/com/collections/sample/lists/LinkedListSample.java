package com.collections.sample.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample
{
    public static void main(final String[] args) {
        final LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(345);
        linkedList.add(345);
        linkedList.add(0);
        linkedList.add(35);
        linkedList.add(45);
        for (final Integer integer : linkedList) {
            System.out.println(integer);
        }
        System.out.println();
        System.out.println();
        final LinkedList<String> linkedListString = new LinkedList<String>();
        linkedListString.add("Value1");
        linkedListString.add("Value1");
        linkedListString.add(null);
        linkedListString.add("Value1value");
        linkedListString.add("Value1Value1");
        for (final String string : linkedListString) {
            System.out.println(string);
        }
    }
}