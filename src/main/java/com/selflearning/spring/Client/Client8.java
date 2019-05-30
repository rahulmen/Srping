package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client8 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans7.xml");
    Test8 test8 = (Test8)applicationContext.getBean("test8");
    test8.getName();

}


}
