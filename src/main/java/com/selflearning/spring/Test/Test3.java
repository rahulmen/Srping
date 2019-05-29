/*
This is a Class having private Constructor. So using normal methood we can not create Object
 of this class.
 We need to use reflextion Class Concept to create Object of class with private Constructor.
 */


package com.selflearning.spring.Test;

public class Test3 {

    private String name;
    private int number;

    private Test3(String name,int number){
        this.name=name;
        this.number=number;
    }

    public void printNameNumber(){
        System.out.print(this.name + "==" + this.number);
    }


}
