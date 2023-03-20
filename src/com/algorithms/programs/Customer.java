package com.algorithms.programs;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Customer
{
    String name;
    String dob;
    BufferedReader reader;
    
    public Customer() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public static void main(final String[] args) throws IOException {
        final Customer customer = new Customer();
        customer.readData();
        customer.DisplayData();
    }
    
    public void DisplayData() {
        final StringTokenizer stringToken = new StringTokenizer(this.dob);
        System.out.println(this.name);
        while (stringToken.hasMoreTokens()) {
            System.out.println("," + stringToken.nextToken());
        }
        System.out.println("");
    }
    
    public void readData() throws IOException {
        System.out.println("Enter the name: ");
        this.name = this.reader.readLine();
        System.out.println("Enter the DOB <dd-mm-yyyy>: ");
        this.dob = this.reader.readLine();
    }
}