package com.algorithms.programs;

public class Contract extends Staff
{
    int period;
    
    protected void getStaffDetails() {
        super.getStaffDetails();
        System.out.println("Enter the number of contract period: ");
        this.period = this.scan.nextInt();
    }
    
    protected void displayStaffDetails() {
        System.out.println("StaffID: " + this.staffId + "\t" + "Name: " + this.name + "\t" + "Contract Period: " + this.period + "\t");
    }
}