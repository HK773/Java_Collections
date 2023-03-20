package com.collections.sample.lists;

import java.util.Iterator;
import java.util.Vector;

public class VectorSample
{
    public static void main(final String[] args) {
        final Vector<Integer> vector = new Vector<Integer>();
        vector.add(3);
        vector.add(0);
        vector.add(3);
        vector.add(29);
        vector.add(67);
        final Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        final Vector<String> vectorString = new Vector<String>();
        vectorString.add("value1");
        vectorString.add(null);
        vectorString.add("value1");
        vectorString.add("value13");
        vectorString.add("valuevalue1");
        final Iterator<String> iterateString = vectorString.iterator();
        while (iterateString.hasNext()) {
            System.out.println(iterateString.next());
        }
    }
}
