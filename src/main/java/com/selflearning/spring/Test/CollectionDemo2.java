package com.selflearning.spring.Test;

import java.util.*;

public class CollectionDemo2 {

    private LinkedList vector1;


    public LinkedList getVector1() {
        return vector1;
    }

    public void setVector1(LinkedList vector1) {
        this.vector1 = vector1;
    }

    public void getBeanCollectionInfo(){

        System.out.println("List Values are:");
        for(Object obj:vector1){
            System.out.println(obj);
        }
        System.out.println("========");

        //In Set we can not store duplicte value if we try to store duplicate value then latest one will replace the old value

    }
}
