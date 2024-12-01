package org.example.RestAssuredBasicsGet;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_005_BDDStyle {

    @Test
    public void test_Get_Req_POSITIVE(){
        String pin_code = "444105";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pin_code)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all()
                    .statusCode(200);

    }

    @Test
    public void test_Get_Req_NEGATIVE(){
        String pin_code = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us\n")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);

    }

}
