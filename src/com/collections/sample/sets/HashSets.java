package com.collections.sample.sets;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

public class HashSets
{
    public static void main( String[] args) {
         HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(null);
        hashSet.add(45);
        hashSet.add(450);
        hashSet.add(452);
        hashSet.add(415);
        System.out.println("HashSet Iteration:");
         Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
         TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(98);
        treeSet.add(99);
        treeSet.add(980);
        treeSet.add(998);
        treeSet.add(198);
        System.out.println("TreeSet Iteration:");
         Iterator<Integer> iterateTreeSet = treeSet.iterator();
        while (iterateTreeSet.hasNext()) {
            System.out.println(iterateTreeSet.next());
        }
    }
}
