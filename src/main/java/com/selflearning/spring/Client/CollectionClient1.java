package com.selflearning.spring.Client;

import com.selflearning.spring.Test.CollectionDemo1;
import com.selflearning.spring.Test.Test8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionClient1 {

public static void main(String... args){

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/Collection1.xml");
    CollectionDemo1 collectionDemo1 = (CollectionDemo1)applicationContext.getBean("collection");
    collectionDemo1.getBeanCollectionInfo();

}

}
