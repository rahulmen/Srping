/*
This is a Class having private Constructor. So using normal methood we can not create Object
 of this class.
 We need to use reflextion Class Concept to create Object of class with private Constructor.
 */


package com.selflearning.spring.Test;

public class Test4 {

    private String name;
    private int number;

    private Test4(String name){
        this.name=name;
    }

    private Test4(int number){
        this.number=number;
    }

    public void printNameNumber(){
        System.out.print(name + "==" + number);
    }

}
