package com.algorithms.programs;

public class Technical extends Staff
{
    String[] skills;
    
    @Override
    protected void getStaffDetails() {
        super.getStaffDetails();
        System.out.println("Enter the number of skills: ");
        final int skillCount = this.scan.nextInt();
        this.skills = new String[skillCount];
        System.out.println("Enter the skill set names: ");
        for (int i = 0; i < skillCount; ++i) {
            this.skills[i] = this.scan.next();
        }
    }
    
    @Override
    protected void displayStaffDetails() {
        for (int i = 0; i < this.skills.length; ++i) {
            System.out.print("\t" + this.skills[i] + "\t");
        }
    }
}
