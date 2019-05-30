package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test5;
import com.selflearning.spring.Test.Test6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client6 {

public static void main(String... args){


    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans5.xml");
    Test6 test6 = (Test6)applicationContext.getBean("test6");
    test6.getName();

}


}
