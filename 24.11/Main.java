package com.disclosure.pack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyString myStr = new MyString("Barselona");
        System.out.println(myStr.charAt(2));
        System.out.println(new MyString("Hello"));
        System.out.println(new MyString("Spain"));
        myStr = myStr.concat(new MyString(("<3")));
        System.out.println(myStr);
        System.out.println(myStr.equals(new MyString("Football club")));
        System.out.println(myStr.indexOf(new MyString("Bars")));
        System.out.println(myStr.length());
        System.out.println(Arrays.toString(myStr.split('b')));
        System.out.println(myStr.substring(0,5));


    }
}
