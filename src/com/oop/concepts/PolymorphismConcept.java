package com.oop.concepts;

public class PolymorphismConcept
{
    void read() {
        System.out.println("Read from the super class");
    }
    
    public static void main( String[] args) {
         PolymorphismConcept concept = new PolymorphismConcept();
        concept.read();
        new FunctionOverloading().read();
    }
}
