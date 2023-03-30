package com.test.api;

import com.test.BaseApiCall;
import com.test.data.ApiData;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.when;

public class BaseApi extends BaseApiCall {
    public BaseApi(){
        System.out.println("creating BaseApi");
    }
    @Autowired
    private ApiData apiData;

    @Given("I call api with {string}")
    public void i_call_api_with(String raceValue) {
//        when().request("GET", "https://dog.ceo/api/breed/husky/images/random").then().statusCode(200);
        System.out.println("urlBase: " + apiData.getUrlBase());
//        when().request("GET", "https://dog.ceo/api/breed/husky/images/random").then().statusCode(200);
        String myUrl = apiData.getUrlBase().replace("[race]", raceValue);
        System.out.println("myUrl: " + myUrl);
//        when().request("GET", myUrl).then().statusCode(200);
        Response rsp = when().request("GET", myUrl);
        rsp.then().statusCode(200);
        System.out.println("output: ");
        rsp.getBody().prettyPrint();
    }

}
