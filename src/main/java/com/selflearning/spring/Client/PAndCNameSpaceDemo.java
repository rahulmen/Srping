package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Car4;
import com.selflearning.spring.Test.PropertyDemo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PAndCNameSpaceDemo {

public static void main(String... args){

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Car4.xml");
    Car4 car4 = (Car4) applicationContext.getBean("car");
    car4.getInfo();
}

}
