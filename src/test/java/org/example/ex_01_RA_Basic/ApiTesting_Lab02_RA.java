package org.example.ex_01_RA_Basic;

import io.restassured.RestAssured;


import java.util.Scanner;

public class ApiTesting_Lab02_RA {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Pincode");
        String pincode = sc.next();


        RestAssured
                .given().baseUri("http://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);





    }
}
