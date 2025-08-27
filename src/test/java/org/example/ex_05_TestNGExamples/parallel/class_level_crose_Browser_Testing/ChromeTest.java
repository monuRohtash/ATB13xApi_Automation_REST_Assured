package org.example.ex_05_TestNGExamples.parallel.class_level_crose_Browser_Testing;

import org.testng.annotations.Test;

public class ChromeTest {

   @Test
    public void Test_Chrome1(){
        System.out.println("1");
       System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void Test_Chrome2(){
        System.out.println("1");
       System.out.println(Thread.currentThread().getId());
    }
}
