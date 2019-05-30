package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client7 {

public static void main(String... args){


    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans6.xml");
    Test7 test7 = (Test7)applicationContext.getBean("test7");
    test7.getName();

}


}
