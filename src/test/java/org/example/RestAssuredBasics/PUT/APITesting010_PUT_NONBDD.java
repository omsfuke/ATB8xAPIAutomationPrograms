package org.example.RestAssuredBasics.PUT;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_PUT_NONBDD {

    RequestSpecification requestSpecification;

    //{
    //    "token": "76531c12d3e165c"
    //}
    @Description("Verify the PUT Request for the Restful booker App")
    @Test
    public void test_put_non_bdd(){
        //Booking id
        //bookingid": 4537
        //token,payload
        //Content
        // payload - {
        //    "firstname": "Jim",
        //        "lastname": "Brown",
       //         "totalprice": 111,
        //        "depositpaid": true,
       //         "bookingdates": {
         //   "checkin": "2018-01-01",
         //           "checkout": "2019-01-01"
       // },
        //    "additionalneeds": "Breakfast"
        //}

        String token = "76531c12d3e165c";
        String bookingid = "4537";

        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "      \"lastname\": \"Brown\",\n" +
                "         \"totalprice\": 111,\n" +
                "        \"depositpaid\": true,\n" +
                "         \"bookingdates\": {\n" +
                "           \"checkin\": \"2018-01-01\",\n" +
                "           \"checkout\": \"2019-01-01\",\n" +
                 "},    \n" +
                 "      \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
       // requestSpecification.auth().preemptive().basic("admin","password123");
        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPUT).log().all();

        Response response = requestSpecification.when().put();

        ValidatableResponse validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);







    }
}
