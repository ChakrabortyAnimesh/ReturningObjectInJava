package com.company.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test ob1 = new Test(20);
        Test ob2=ob1.incrbyten();
        System.out.println(ob1.i);
        System.out.println(ob2.i);
    }
}
