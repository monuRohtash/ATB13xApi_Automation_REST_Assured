package org.example.ex_05_TestNGExamples.parallel.Method_level;

import org.testng.annotations.Test;

public class Login_Test {


    @Test
    public void validLogin() {
        System.out.println("validLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin2() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }
}
