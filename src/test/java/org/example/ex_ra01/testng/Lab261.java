package org.example.ex_ra01.testng;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Lab261 {

    @Description("TC# - Verify 261 get request 1")
    @Test
    public void getRequest1(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }
    @Description("TC# - Verify 261 get request 2")
    @Test
    public void getRequest2(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }
}
