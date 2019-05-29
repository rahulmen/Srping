package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client3 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans2.xml");
    Test3 test3 = (Test3)applicationContext.getBean("test3");
    test3.printNameNumber();

}


}
