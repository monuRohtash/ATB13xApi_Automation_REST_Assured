package org.example.ex_01_RA_Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAssuredHelloWorld {


    public static void main(String[] args) {

//
//        RestAssured.given()
//                .baseUri("https://restful-booker.herokuapp.com")
//                .basePath("/ping")
//                .when()
//                .log().all().get()
//                .then()
//                .log().all().statusCode(201);



        // Step 1: Base URL
        RestAssured.baseURI = "https://reqres.in";

        // Step 2: Send GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/api/users?page=2")
                .then()
                .extract()
                .response();

        // Step 3: Print Response
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.asPrettyString());



    }


}
