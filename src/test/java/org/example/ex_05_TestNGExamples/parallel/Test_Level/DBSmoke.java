package org.example.ex_05_TestNGExamples.parallel.Test_Level;

import org.testng.annotations.Test;

public class DBSmoke {

    @Test
    public void test_DB_Smoke() {
        System.out.println(Thread.currentThread().getId());
    }
}
