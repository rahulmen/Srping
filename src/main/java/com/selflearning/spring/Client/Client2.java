/*
Reflextion class used to create Object of private Class Constructor.
In a Similar way IOC container user reflextion class to create Object of private Class Constructor.
 */

package com.selflearning.spring.Client;

import com.selflearning.spring.Test.Test2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client2 {

    public static void main(String... args){

        try {
              ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Beans1.xml");
/*
            Internally spring use below technique to access private Constructor
            Class aclass = Class.forName("com.selflearning.spring.Test.Test2");
            Constructor[] constructors=aclass.getDeclaredConstructors();
            constructors[0].setAccessible(true);
*/
                Test2 test2 = (Test2) applicationContext.getBean("test2");
            }
            catch(Exception nsee){
                nsee.printStackTrace();
            }


    }


}
