/*

This program demonstrate how we can use call by reference concept to perform secondary dependency injection

Engine 1 has 1 primitive variable which has been initialized by Car1.xml using property tag

Car1 has 1 primitive and 1 secondary dependency which has been intialized by Car1.xml and in Car1.xml we use inner beam approach
to initialize Secondary reference.

Using inner beam approach we can create Object for particular class only like.

class Car{
public void info(Engine engine){};
}

class Engine{
new Car().info(new Engine());

}


Cat1Client is the client which is calling.

 */


package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Car2;
import com.selflearning.spring.Test.Car3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyCheckCar3Client {

public static void main(String... args){

    String[] file = new String[]{"src/main/resources/DepedencyCheck1.xml"};

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext(file);
    Car3 car = (Car3)applicationContext.getBean("dependencyCheck");
    car.getInfo();
}


}
