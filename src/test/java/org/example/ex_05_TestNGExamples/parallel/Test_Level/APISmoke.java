package org.example.ex_05_TestNGExamples.parallel.Test_Level;

import org.testng.annotations.Test;

public class APISmoke {

    @Test
    public void test_Api_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }


}
