package com.company.java;

public class Test {
    int i;
   public Test(int i)
    {
        this.i=i;
    }
    Test incrbyten()
    {
        Test ob=new Test(i+10);
        return ob;
    }
}
