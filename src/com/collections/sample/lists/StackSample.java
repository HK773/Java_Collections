package com.collections.sample.lists;

import java.util.Iterator;
import java.util.Stack;

public class StackSample
{
    public static void main(final String[] args) {
        final Stack<String> stackString = new Stack<String>();
        stackString.push("Values01");
        stackString.push(null);
        stackString.push("Values01");
        stackString.push("Values01");
        stackString.push("ValuesValue01");
        for (final String string : stackString) {
            System.out.println(string);
        }
        System.out.println();
        stackString.pop();
        System.out.println("Pop out elements");
        final Iterator<String> iterateStringValue = stackString.iterator();
        while (iterateStringValue.hasNext()) {
            System.out.println(iterateStringValue.next());
        }
    }
}