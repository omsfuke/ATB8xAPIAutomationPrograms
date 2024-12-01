package org.example.RestAssuredBasicsGet;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_006_NonBDDStyle {

    static RequestSpecification r = RestAssured.given();

    @Description("TC1 - NonBDDStyleGET - Positive Testcase")
    @Test
    public void test_NonBDDStyle_Positive(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/444105");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Description("TC1 - NonBDDStyleGET - Negative Testcase")
    @Test
    public void test_NonBDDStyle_Negative(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/444105");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }





}
