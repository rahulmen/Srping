package com.selflearning.spring.Client;

import com.selflearning.spring.Test.CollectionDemo1;
import com.selflearning.spring.Test.CollectionDemo2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionClient2 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Collection2.xml");
    CollectionDemo2 collectionDemo2 = (CollectionDemo2) applicationContext.getBean("collection2");
    collectionDemo2.getBeanCollectionInfo();
}

}
