/*

As ApplicationContext is a progressive Container it will create Object at the type of ClassPathXmlApplicationContext
Object Creation.
We Dont need to call getBean() method for Object Creation.

As in DependsOnBean xml we have configured that DependsClassA has dependency on DependsClassB and DependsClassB has dependency on
DependsClassC so first C class object will created then B class Object and then A class Object.

Example :- In MVC Bases application we need to build controller part and model part and in model part we have bussiness layer
and DAO and also we have presentation part.Here to pass user input controller is required and for contrioller we need bussiness
part and DAO part is dependent on Bussiness part.So here depends-on is used.

We use depends on where we want any class Object creation mandatory before creating any class Object.
 */




package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Car3;
import com.selflearning.spring.Test.DependsClassA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependsOnCLassLevel {

public static void main(String... args){

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependsOnBean.xml");
    //DependsClassA dependsClassA = ()applicationContext.getBean("a");
}


}
