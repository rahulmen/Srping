package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test3;
import com.selflearning.spring.Test.Test4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client4 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans3.xml");
    //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/main/resources/Beans3.xml");
    Test4 test4a = (Test4) applicationContext.getBean("test4a");
    test4a.printNameNumber();

}


}
