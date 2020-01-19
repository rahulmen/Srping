package com.selflearning.spring.Test;

import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;

public class PropertyDemo1 {

   private Properties property;

    public Properties getProperty() {
        return property;
    }

    public void setProperty(Properties property) {
        this.property = property;
    }


    public void printData(){
        Set set = property.keySet();
        for(Object obj:set){
            System.out.println("Key "+obj+" value:"+property.getProperty(obj.toString()));
        }

    }
}
