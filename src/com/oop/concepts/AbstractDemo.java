package com.oop.concepts;

public class AbstractDemo
{
    public static void main( String[] args) {
         AbstractionBase abstractObject = new AbstractHelper();
        System.out.println("starting from Demo class");
        abstractObject.engine();
        abstractObject.viper();
    }
}