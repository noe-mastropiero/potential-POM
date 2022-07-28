package com.services.test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports", "json:target/cucumber-json" },
        features = "src/test/resources/AcceptanceTests",
        glue = "com.learning",
        strict = true,
        tags = {"@RunThis"},
        snippets =SnippetType.CAMELCASE)
public class CucumberRunnerTest {
}
