package com.learning.steps;
import com.learning.utilities.Request;
import com.learning.utilities.UrlBuilder;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.*;

public class GetSteps {
    private UrlBuilder urlBuilder;
    private Request request;

    public GetSteps(Request request, UrlBuilder urlBuilder){
        this.request = request;
        this.urlBuilder = urlBuilder;
    }
    @Then("^I make a \"GET\" request to the API$")
    public void GetRequest(){
        String url = this.urlBuilder.builder(this.request.requestPath, this.request.requestParams);
        RestAssured.get(url);
    }
}
