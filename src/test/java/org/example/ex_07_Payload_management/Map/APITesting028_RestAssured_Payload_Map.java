package org.example.ex_07_Payload_management.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting028_RestAssured_Payload_Map {

    RequestSpecification RS;
    ValidatableResponse VR;
    Response response;
    String token;
    Integer bookingId;


    @Test
    public void test_post() {


//        String payload_Post = "{\n" +
//                "    \"firstname\" : \"Raghav\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";

        // Hashmap -> key and value pair
        // Parent Hashmap ->  key and value , Child Hashmap

        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap<>();

        jsonBodyUsingMap.put("firstname","Monu");
        jsonBodyUsingMap.put("lastname","Raghav");
        jsonBodyUsingMap.put("totalprice", 123);
        jsonBodyUsingMap.put("depositpaid", false);

        Map<String,Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2025-12-01"); // YYYY-MM-DD
        bookingDatesMap.put("checkout","2025-12-05");

        jsonBodyUsingMap.put("bookingdates",bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds", "Breakfast");

        System.out.println(jsonBodyUsingMap);


        RS = RestAssured.given();
        RS.baseUri("https://restful-booker.herokuapp.com/");
        RS.basePath("/booking");
        RS.contentType(ContentType.JSON);
        RS.body(jsonBodyUsingMap).log().all();

        Response response = RS.when().post();


        // Get Validatable response to perform validation
        VR = response.then().log().all();
        VR.statusCode(200);

        // Rest Assured -> import org.hamcrest.Matchers; %4-%5
        // Matchers.equalto()

        VR.body("booking.firstname", Matchers.equalTo("Monu"));
        VR.body("booking.lastname", Matchers.equalTo("Raghav"));
        VR.body("booking.depositpaid", Matchers.equalTo(false));
        VR.body("bookingid", Matchers.notNullValue());


    }

    }
