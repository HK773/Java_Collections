package com.collections.sample.lists;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListSample
{
    public static void main(final String[] args) {
        final ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(33);
        arrayList.add(null);
        arrayList.add(23);
        arrayList.add(33);
        arrayList.add(43);
        arrayList.add(53);
        System.out.println("Using Iterator");
        final Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println("Using For Loop");
        for (int i = 0; i < arrayList.size(); ++i) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Using for each loop");
        for (final Integer arrayValues : arrayList) {
            System.out.println(arrayValues);
        }
        System.out.println();
        int index = 0;
        System.out.println("Using while loop");
        while (arrayList.size() > index) {
            System.out.println(arrayList.get(index));
            ++index;
        }
        System.out.println();
    }
}
