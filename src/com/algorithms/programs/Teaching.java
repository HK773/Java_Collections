package com.algorithms.programs;

import java.io.IOException;

public class Teaching extends Staff
{
    String domain;
    String publications;
    
    @Override
    protected void getStaffDetails() {
        super.getStaffDetails();
        try {
            System.out.println("Enter Domain details: ");
            this.domain = this.reader.readLine();
            System.out.println("Enter publication details: ");
            this.publications = this.reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @Override
    protected void displayStaffDetails() {
        System.out.println("StaffID: " + this.staffId + "\t" + "Name: " + this.name + "\t" + "Phone no: " + this.phone + "\t" + "Salary: " + this.salary + "\t" + "Domain: " + this.domain + "\t" + "Publications: " + this.publications);
    }
}