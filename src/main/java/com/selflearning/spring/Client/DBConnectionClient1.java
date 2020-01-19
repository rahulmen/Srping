package com.selflearning.spring.Client;

import com.selflearning.spring.Test.DbConnectionTest1;
import com.selflearning.spring.Test.PropertyDemo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DBConnectionClient1 {

public static void main(String... args) throws Exception{


    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DBConnection1.xml");
    DbConnectionTest1 dbConnectionTest1 = (DbConnectionTest1) applicationContext.getBean("DBConn");
    dbConnectionTest1.printConnection();

}

}
