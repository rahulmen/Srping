/*
This Class Demonstrate how we can pass Secondary and primitive Arrays from Beans.xml and configured it
using constructor.

 */


package com.selflearning.spring.Test;

public class Test7 {

private String[] name;


    private Test7(String[] name){
        this.name=name;
    }

    public void getName(){
        for(String number1:name){
            System.out.print(number1+" ");
        }
    }
}
