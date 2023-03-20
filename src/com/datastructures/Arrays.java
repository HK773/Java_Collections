package com.datastructures;

public class Arrays
{
    static int count;
    
    static {
        Arrays.count = 0;
    }
    
    public static void main( String[] args) {
         int[] arr = new int[9];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = ++Arrays.count;
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i] + " ");
        }
        
        System.out.println();
         int[] array1 = { 13, 23, 33, 43, 43 };
        try {
            for (int j = 0; j < array1.length; ++j) {
                System.out.print(" " + array1[j] + " ");
            }
        }
        catch (Exception ex) {}
    }
}
