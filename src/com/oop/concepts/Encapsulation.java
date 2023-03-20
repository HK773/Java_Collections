package com.oop.concepts;

import java.util.Scanner;

public class Encapsulation
{
    public static void main( String[] args) {
         Encapsulation capsulaObject = new Encapsulation();
         Student student = new Student();
        capsulaObject.readStudentDetails(student);
        capsulaObject.displayStudentDetails(student);
    }
    
    public void readStudentDetails( Student student) {
        try {
             Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student details: ");
            System.out.println("Enter Student Name");
            student.setUSN(scan.next());
            System.out.println("Enter Student USN: ");
            student.setName(scan.next());
            System.out.println("Enter Student phone: ");
            student.setPhone(scan.next());
            scan.close();
        }
        catch (Exception e) {
            System.out.println("excetion");
        }
    }
    
    public void displayStudentDetails( Student student) {
        System.out.println("USN: " + student.getUSN());
        System.out.println("Name: " + student.getName());
        System.out.println("Phone: " + student.getPhone());
    }
}