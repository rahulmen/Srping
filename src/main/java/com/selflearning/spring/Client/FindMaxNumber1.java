package com.selflearning.spring.Client;

public class FindMaxNumber1 {



public static void main(String[] args){


    String s = "Sahil";
    String str1 = new String("abc.txt");

    String str2 = new String("abc.txt");
    System.out.println(str1==str2);// False
    System.out.println(str1.equals(str2));// True


    StringBuffer str3 = new StringBuffer("abc.txt");
    StringBuffer str4 = new StringBuffer("abc.txt");
    System.out.println(str3==str4); //True
    System.out.println(str3.equals(str4)); //True




}



}
