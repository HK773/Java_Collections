package com.collections.sample.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets
{
    public static void main( String[] args) {
         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(null);
        linkedHashSet.add(535);
        linkedHashSet.add(534);
        linkedHashSet.add(523);
        linkedHashSet.add(253);
         Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}