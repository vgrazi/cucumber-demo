package com.vgrazi.demo.cucumberdemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber.html",
                "pretty"
        },

        features = "src/test/resources/features",

        tags = {"not @ignored"}
)
public class RunCukesTest {

}