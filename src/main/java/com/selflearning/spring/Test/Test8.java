/*
This Class Demonstrate how we can pass Secondary and primitive Arrays from Beans.xml and configured it
using constructor.

 */


package com.selflearning.spring.Test;

public class Test8 {

private String name;
private int number;
private String lastName;

    private Test8(String name,String lastName,int number)
    {
        this.name=name;
        this.lastName=lastName;
        this.number=number;
    }

    public void getName(){
        System.out.print("Name : "+name+"\n"+" LastName : "+lastName+"\n"+" Number : "+number);
    }
}
