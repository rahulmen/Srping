package com.selflearning.spring.Client;

import com.selflearning.spring.Test.PropertyDemo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProperryClient2 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Property2.xml");
    PropertyDemo1 propertyDemo1 =(PropertyDemo1) applicationContext.getBean("property");
    propertyDemo1.printData();

}

}
