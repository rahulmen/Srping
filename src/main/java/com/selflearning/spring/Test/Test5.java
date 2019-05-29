/*
This is a Class having private Constructor. So using normal methood we can not create Object
 of this class.
 We need to use reflextion Class Concept to create Object of class with private Constructor.
 */


package com.selflearning.spring.Test;

public class Test5 {

    private String name;
    private int number;

    private Test5(){
        System.out.println("Default Constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printNameNumber(){
        System.out.println(name + "==" + number);
    }

}
