package com.algorithms.searching;

import java.util.Scanner;

public class JumpSearchAlgorithm
{
    public static void main( String[] args) {
        JumpSearchAlgorithm jumpSearchObject = new JumpSearchAlgorithm();
        Scanner scan = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Enter the key value to be searched:");
        int key = scan.nextInt();
         int start = 0;
         int length = arr.length;
         int value = jumpSearchObject.jumpSearch(start, length, key, arr);
        if (value == -1) {
            System.out.println(value);
        }
        else {
            System.out.println("Found at Index: " + value);
        }
        scan.close();
    }
    
    public int jumpSearch(int start, int length,  int key,  int[] arr) {
        int end = (int)Math.sqrt(length);
        System.out.println("Length is: " + length);
        System.out.println("Square root value is: " + end);
        while (arr[end] <= key && end < length) {
            start = end;
            end += (int)Math.sqrt(length);
            if (end > length - 1) {
                end = length;
            }
        }
        for (int i = start; i <= end; ++i) {
            System.out.println(arr[i]);
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}