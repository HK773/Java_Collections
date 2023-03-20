package com.algorithms.programs;

import java.util.Random;
import java.util.Scanner;

public class QuickSort
{
    int[] a;
    int num;
    Scanner scan;
    Random rm;
    
    QuickSort(final int n) {
        this.scan = new Scanner(System.in);
        this.rm = new Random();
        this.num = n;
        this.a = new int[n];
    }
    
    void swap(final int i, final int j) {
        final int temp = this.a[i];
        this.a[i] = this.a[j];
        this.a[j] = temp;
    }
    
    void dataInput() {
        for (int i = 0; i < this.num; ++i) {
            this.a[i] = this.rm.nextInt();
        }
    }
    
    public static void main(final String[] args) {
    }
}