package com.algorithms.searching;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class MetaBinarySearch
{
    public static void main( String[] args) {
         MetaBinarySearch metaBinarySearchObject = new MetaBinarySearch();
         Vector<Integer> vector = new Vector<Integer>();
         int[] arr = { -10, -5, 4, 6, 8, 10, 11 };
        System.out.println("Enter the key value to be searched:");
         Scanner scan = new Scanner(System.in);
         int key = scan.nextInt();
        for (int i = 0; i < arr.length; ++i) {
            vector.add(arr[i]);
        }
         int value = metaBinarySearchObject.metaBinarySearch(vector, key);
        if (value == -1) {
            System.out.println(value);
        }
        else {
            System.out.println("Found at Index: " + value);
        }
        scan.close();
    }
    
    public int metaBinarySearch( Vector<Integer> vector,  int key) {
         int n = vector.size();
         int a = (int)Math.log(n - 1);
        System.out.println("a:" + a);
         BigInteger d = BigInteger.valueOf(a);
        System.out.println("d:" + d);
         int lg = d.intValue() + 1;
        System.out.println("Length of the vector: " + n);
        System.out.println("largest array index: " + lg);
        int pos = 0;
        for (int i = lg - 1; i >= 0; --i) {
            if (vector.get(pos) == key) {
                return pos;
            }
             int new_pos = pos | 1 << i;
            if (new_pos < n && vector.get(new_pos) <= key) {
                pos = new_pos;
            }
        }
        return (vector.get(pos) == key) ? pos : -1;
    }
}
