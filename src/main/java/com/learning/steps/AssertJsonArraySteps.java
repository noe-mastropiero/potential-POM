package com.learning.steps;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;


public class AssertJsonArraySteps {

    private Response response;

    public AssertJsonArraySteps(Response response){this.response = response;}

    @Then("^the response is an array where each entry has a field of \"([^\"]*)\"$")
    public void assertAllKeysInArray(String key){
    }



}