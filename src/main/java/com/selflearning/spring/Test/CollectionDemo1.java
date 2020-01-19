package com.selflearning.spring.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionDemo1 {

    private List list1;
    private Set set1;
    private Map map1;

    public List getList1() {
        return list1;
    }

    public void setList1(List list1) {
        this.list1 = list1;
    }

    public Set getSet1() {
        return set1;
    }

    public void setSet1(Set set1) {
        this.set1 = set1;
    }

    public Map getMap1() {
        return map1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
    }

    public void getBeanCollectionInfo(){

        System.out.println("List Values are:");
        for(Object obj:list1){
            System.out.println(obj);
        }
        System.out.println("========");

        //In Set we can not store duplicte value if we try to store duplicate value then latest one will replace the old value

        System.out.println("Set Values are:");
        for(Object obj:set1){
            System.out.println(obj);
        }
        System.out.println("========");


        System.out.println("Map Values are:");

        Set mapSet = map1.keySet();

        for(Object obj : mapSet){
            System.out.println("Key "+obj+" Value: "+map1.get(obj));
        }


    }
}
