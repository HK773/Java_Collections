package com.collections.sample.maps;

import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class HashMaps
{
    public static void main( String[] args) {
         HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Electronic & Gadgets");
        hashMap.put(2, "Groceries");
        hashMap.put(3, "Book");
        hashMap.put(4, "Groceries");
        hashMap.put(5, "Clothing");
        for ( Map.Entry<Integer, String> value : hashMap.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
        System.out.println();
        System.out.println();
         TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4, "1001");
        treeMap.put(10, "1010");
        treeMap.put(2, "01");
        for ( Map.Entry<Integer, String> keyValuePair : treeMap.entrySet()) {
            System.out.println(keyValuePair.getKey() + " " + keyValuePair.getValue());
        }
    }
}