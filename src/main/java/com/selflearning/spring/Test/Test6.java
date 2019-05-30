/*
This Class Demonstrate how we can pass Secondary and primitive Arrays from Beans.xml and configured it
using setter method.

 */


package com.selflearning.spring.Test;

public class Test6 {

private String[] name;

    public void setName(String[] name) {
        this.name = name;
    }

    public void getName(){
        for(String number1:name){
            System.out.print(number1+" ");
        }
    }
}
