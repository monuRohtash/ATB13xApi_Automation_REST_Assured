package org.example.ex_02_RA_Concepts;

public class ApiTesting_Lab04_Builder_Pattern {


    public ApiTesting_Lab04_Builder_Pattern step1() {
        System.out.println("step1");
        return this;
    }

    public ApiTesting_Lab04_Builder_Pattern step2() {
        System.out.println("step2");
        return this;
    }

    public ApiTesting_Lab04_Builder_Pattern step3(String param1) {
        System.out.println("step3 :" +param1);
        return this;
    }

    public ApiTesting_Lab04_Builder_Pattern step4(String param2) {
        System.out.println("step4 :" + param2);
        return this;

    }

    public static void main(String[] args) {

        ApiTesting_Lab04_Builder_Pattern BP = new ApiTesting_Lab04_Builder_Pattern();

        BP.step1().step2().step3("Rest").step4("Assort");

    }





}
