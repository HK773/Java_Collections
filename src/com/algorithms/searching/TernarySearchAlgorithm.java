package com.algorithms.searching;

import java.util.Scanner;

public class TernarySearchAlgorithm
{
    public static void main( String[] args) {
         TernarySearchAlgorithm ternarySearchObject = new TernarySearchAlgorithm();
         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key value to be searched:");
         int key = scan.nextInt();
         int start = 0;
         int length = arr.length;
         int value = ternarySearchObject.ternarySearch(start, length, key, arr);
        if (value == -1) {
            System.out.println(value);
        }
        else {
            System.out.println("Found at Index: " + value);
        }
        scan.close();
    }
    
    public int ternarySearch( int start,  int length,  int key,  int[] arr) {
        if (length < start) {
            return -1;
        }
         int mid1 = start + (length - 1) / 3;
         int mid2 = length - (length - 1) / 3;
        System.out.println("mid1= " + mid1 + " mid2= " + mid2);
        if (key == arr[mid1]) {
            return mid1;
        }
        if (key == arr[mid2]) {
            return mid2;
        }
        if (key < arr[mid1]) {
            return this.ternarySearch(start, mid1 - 1, key, arr);
        }
        if (key > arr[mid2]) {
            return this.ternarySearch(mid2 + 1, length, key, arr);
        }
        return this.ternarySearch(mid1 + 1, mid2 - 1, key, arr);
    }
}