package org.example.ex_05_TestNGExamples;

import org.testng.annotations.*;

public class APITesting016_TestNG_Priority {
    
    
    @Test(priority = 1)
    public void test_t1(){
        System.out.println("priority-1");
    }

    @Test(priority = 3)
    public void test_t2(){
        System.out.println("priority-3");
    }

    @Test(priority = 2)
    public void test_t3(){
        System.out.println("priority-2");
    }

    @Test(priority = 4)
    public void test_t4(){
        System.out.println("priority-4");
    }


    
}
