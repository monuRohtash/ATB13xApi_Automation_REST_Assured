package org.example.ex_07_Payload_management.String;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting027_1_RestAssured_TestNG_AssertJ_Assertions {

    RequestSpecification RS;
    ValidatableResponse VR;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_post(){

        String name = "Raghav";

        String payload_Post="{\n" +
                "    \"firstname\" : \"+name+\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";



//.......



    }




}
