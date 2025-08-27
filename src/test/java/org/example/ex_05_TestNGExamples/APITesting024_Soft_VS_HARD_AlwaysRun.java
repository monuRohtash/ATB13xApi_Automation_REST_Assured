package org.example.ex_05_TestNGExamples;

import org.testng.annotations.*;

public class APITesting024_Soft_VS_HARD_AlwaysRun {


    @Test
    public void login() { /* might fail */ }

    @Test(dependsOnMethods = "login")         // Hard dependency
    public void placeOrder() { /* runs only if login passed */ }

    @Test(dependsOnMethods = "login", alwaysRun = true)        // Soft dependency

    public void closeBrowser() { /* runs even if login failed */ }
}
