/*
This is a Class having private Constructor. So using normal methood we can not create Object
 of this class.
 We need to use reflextion Class Concept to create Object of class with private Constructor.
 */


package com.selflearning.spring.Test;

public class Test2 {

    private String name;

    private Test2(){
        System.out.print("Private Contructor");
    }

}
