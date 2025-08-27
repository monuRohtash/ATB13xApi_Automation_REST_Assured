package org.example.ex_05_TestNGExamples.parallel.Test_Level;

import org.testng.annotations.Test;

public class UISmoke {

    @Test
    public void test_UI_Smoke() {
        System.out.println(Thread.currentThread().getId());
    }
}
