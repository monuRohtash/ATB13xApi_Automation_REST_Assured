package org.example.ex_05_TestNGExamples.parallel.class_level_crose_Browser_Testing;

import org.testng.annotations.Test;

public class FirefoxTest {

    @Test
    public void Test_firefox(){
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
