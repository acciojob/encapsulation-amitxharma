package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly obj =new RWOnly("John");

        // Directly accessing name results in a compile-time error because it is a private variable.
         //obj.name = "John";  // This line will result in an error.

        obj.setName("Amit");

        System.out.println(obj.getName());
    }
  
}