package com.algorithms.programs;

import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Staff
{
    String staffId;
    String name;
    String phone;
    int salary;
    BufferedReader reader;
    Scanner scan;
    
    public Staff() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.scan = new Scanner(System.in);
    }
    
    protected void getStaffDetails() {
        try {
            System.out.println("Enter Staff Id: ");
            this.staffId = this.scan.next();
            System.out.println("Enter the name of the staff");
            this.name = this.scan.next();
            System.out.println("Enter the phone number: ");
            this.phone = this.scan.next();
            System.out.println("Enter the salary: ");
            this.salary = this.scan.nextInt();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    protected void displayStaffDetails() {
        System.out.println("StaffID: " + this.staffId + "/t" + "Name: " + this.name + "/t" + "Phone no: " + this.phone + "/t" + "Salary: " + this.salary);
    }
}