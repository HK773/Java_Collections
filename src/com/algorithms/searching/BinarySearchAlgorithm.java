package com.algorithms.searching;

import java.util.Scanner;

public class BinarySearchAlgorithm
{
    public static void main( String[] args) {
        int[] arr = { 3, 9, 13, 15, 24, 33 };
        System.out.println("Enter the key value to be searched:");
        Throwable t = null;
        try {
            Scanner scan = new Scanner(System.in);
            try {
               int key = scan.nextInt();
               BinarySearchAlgorithm binarySearchObject = new BinarySearchAlgorithm();
                 int value = binarySearchObject.binarySearch(arr, key);
                if (value == -1) {
                    System.out.println("Element Not found");
                }
                else {
                    System.out.println("Element found at the index: " + value);
                }
                scan.close();
            }
            finally {
                if (scan != null) {
                    scan.close();
                }
            }
        }
        finally {
            if (t == null) {
               Throwable exception = null;
                t = exception;
            }
            else {
               Throwable exception = null;
                if (t != exception) {
                    t.addSuppressed(exception);
                }
            }
        }
    }
    
    public int binarySearch( int[] arr,  int key) {
        System.out.println("Enter function binarySearch");
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid value: " + mid);
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}