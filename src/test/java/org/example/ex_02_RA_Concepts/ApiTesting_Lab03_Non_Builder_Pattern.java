package org.example.ex_02_RA_Concepts;

public class ApiTesting_Lab03_Non_Builder_Pattern {

    public void step1() {
        System.out.println("step1");
    }

    public void step2() {
        System.out.println("step2");
        return;
    }

    public void step3(String param1) {
        System.out.println("step3 :" + param1);
    }

    public void step4(String param2) {
        System.out.println("step4 :" + param2);
        return;

    }

    public static void main(String[] args) {

        ApiTesting_Lab03_Non_Builder_Pattern NBP = new ApiTesting_Lab03_Non_Builder_Pattern();

        NBP.step3("Raghav");
        NBP.step1();
        NBP.step4("Monu");
        NBP.step2();




    }


}
