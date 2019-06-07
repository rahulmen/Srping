package com.selflearning.spring.Test;

import java.util.*;

public class CollectionDemo1 {

    private List list1;
    private Set set1;
    private Map map1;

    public void setList1(List list1) {
        this.list1 = list1;
    }

    public void setSet1(Set set1) {
        this.set1 = set1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
    }

    public void getBeanCollectionInfo(){
        System.out.println(list1);
        System.out.println(set1);
        System.out.println(map1);
    }
}
