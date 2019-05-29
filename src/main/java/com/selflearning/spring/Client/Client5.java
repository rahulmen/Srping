package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test4;
import com.selflearning.spring.Test.Test5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client5 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans4.xml");
    Test5 test5 = (Test5)applicationContext.getBean("test5");
    test5.printNameNumber();
}


}
