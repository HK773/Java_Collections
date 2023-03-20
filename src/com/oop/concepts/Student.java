package com.oop.concepts;

public class Student
{
    private String USN;
    private String name;
    private String phone;
    
    public String getUSN() {
        return this.USN;
    }
    
    public void setUSN( String uSN) {
        this.USN = uSN;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName( String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone( String phone) {
        this.phone = phone;
    }
}