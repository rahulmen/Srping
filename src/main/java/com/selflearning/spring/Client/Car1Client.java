/*

This program demonstrate how we can use call by reference concept to perform secondary dependency injection

Engine 1 has 1 primitive variable which has been initialized by Engine1.xml using property tag

Car1 has 1 primitive and 1 secondary dependency which has been intialized by Car1.xml and in Car1.xml we use ref tag to provide
Engine1.xml bean id.

This refernece is common as bean is defined in Engine1.xml and can be used anywhere required.

Cat1Client is the client which is calling.

 */


package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Car1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Car1Client {

public static void main(String... args){

    String[] file = new String[]{"src/main/resources/Car1.xml","src/main/resources/Engine1.xml"};

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext(file);
    Car1 car = (Car1)applicationContext.getBean("car");
    car.getCarInfo();

}


}
