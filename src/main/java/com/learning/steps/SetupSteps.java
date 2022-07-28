package com.learning.steps;
import com.learning.utilities.Request;
import io.cucumber.java.en.When;

import java.util.Map;

public class SetupSteps {
    private Request request;

    private SetupSteps(Request request) {
        this.request = request;
    }

    @When("^I am targeting the \"([^\"]*)\" API$")
    public void definehostName(String entity) {
        this.request.requestPath.add(entity);
    }

    @When("^the quey parameter are:$")
    public void setFilters(Map<String, String> urlParams){
        this.request.requestParams = urlParams;
    }

    @When("^the quey parameter is$")
    public void setFilter(Map<String, String> urlParams){
        this.request.requestParams = urlParams;
    }

    @When("^the path has key \"([^\"]*)\"$")
    public void defineEntityToTarget(String key) {
        this.request.requestPath.add(key);
    }

    @When("^The request URL has this field \"([^\"]*)\" with this value \"([^\"]*)\" as parameter$")
    public void fieldValueParamets(String field, String parameter) {
        this.request.requestPath.add(field);
        this.request.requestPath.add(parameter);


    }




}
