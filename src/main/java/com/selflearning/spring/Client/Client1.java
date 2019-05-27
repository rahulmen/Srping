package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.File;



public class Client1 {

    public static void main(String[] args){
        File file = new File("src/main/resources/Beans.xml");
        if(file.exists()){
            //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("src/main/resources/Beans.xml");
            ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
            Test1 t = (Test1) applicationContext1.getBean("test1");
            Test1 t1 = (Test1)applicationContext1.getBean("test1");
            //System.out.println("Subject Executed : "+t.getSubject());


        }
        }
}






        /*
        //Resource resource = new ClassPathResource("Beans.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(resource);
            //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/home/rahulmendiratta/office_workspace/spring/Beans.xml");

         */