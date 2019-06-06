package com.selflearning.spring.Test;

import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {

    @Autowired
    public String subject;

    public Test1(){
        System.out.println("Default Constructor Executed");
    }

/*
    public void setSubject(String subject) {
        this.subject = subject;
    }*/
/*

    public String getSubject() {
        return subject;
    }*/
}
