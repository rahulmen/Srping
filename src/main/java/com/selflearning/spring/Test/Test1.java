package com.selflearning.spring.Test;

public class Test1 {

    private String subject;

    public Test1(){
        System.out.println("Default Constructor Executed");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
