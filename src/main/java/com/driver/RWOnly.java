package com.driver;

public class RWOnly {
//    Task 2:
//    create a class named RWOnly in RWOnly.java, with a private member variable name
    private String name;

    public RWOnly(String name) {
        this.name=name;
    }

    //create an constructor
    

    //getter function
    public String getName()
    {
        return name;
    }
    //setter function
    public void setName(String name)
    {
        this.name=name;
    }
    
}
