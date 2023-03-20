package com.algorithms.programs;

import java.util.Scanner;

public class StaffDetails
{
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        try {
            System.out.println("------------Read Teaching Staff----------");
            System.out.println("Enter the number of teaching staff count ");
            final int count1 = scan.nextInt();
            final Teaching[] teach = new Teaching[count1];
            for (int i = 0; i < count1; ++i) {
                teach[i] = new Teaching();
                System.out.println("Enter teaching staff" + (i + 1) + " details");
                teach[i].getStaffDetails();
            }
            System.out.println("------------Read Technical Staff----------");
            System.out.println("Enter the number of technical staff count ");
            final int count2 = scan.nextInt();
            final Technical[] technical = new Technical[count2];
            for (int i = 0; i < count2; ++i) {
                technical[i] = new Technical();
                System.out.println("Enter technical staff" + (i + 1) + " details");
                technical[i].getStaffDetails();
            }
            System.out.println("------------Read Contract Staff----------");
            System.out.println("Enter the number of Contract staff count ");
            final int count3 = scan.nextInt();
            System.out.println("count is: " + count3);
            System.out.println("Waiting to end");
            final Contract[] contract = new Contract[count3];
            for (int i = 0; i < count3; ++i) {
                contract[i] = new Contract();
                System.out.println("Enter Contract staff" + (i + 1) + " details");
                contract[i].getStaffDetails();
            }
            System.out.println("Teaching Staff Details");
            for (int i = 0; i < teach.length; ++i) {
                teach[i].displayStaffDetails();
            }
            System.out.println();
            System.out.println("Technical Staff Details");
            for (int i = 0; i < technical.length; ++i) {
                technical[i].displayStaffDetails();
            }
            System.out.println();
            System.out.println("Contract Staff Details");
            for (int i = 0; i < contract.length; ++i) {
                contract[i].displayStaffDetails();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        scan.close();
    }
}
