package org.example.ex_03_TestNg_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.*;

public class ApiTesting_Lab_6_TestCase {

    String pincode;

    @Test
    //valid pin code -> 121102
    public void test_tc1_pincode_valid() {
        pincode = "121102";

        RestAssured
                .given()
                .baseUri("http://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .log().all().get()
                .then().
                log().all().statusCode(200);
    }

    @Test
    //Invalid pin code -> @#$%^^&*&* any special input
    public void test_tc2_pincode_invalid() {
        pincode = "@#$%^&*";

        RestAssured
                .given()
                .baseUri("http://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .log().all().get()
                .then().
                log().all().statusCode(200);
    }

    @Test
    //Invalid pin code " " -> blank , pincode
    public void test_tc3_pincode_invalid() {
        pincode = " ";

        RestAssured
                .given()
                .baseUri("http://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .log().all().get()
                .then().
                log().all().statusCode(200);
    }


}
