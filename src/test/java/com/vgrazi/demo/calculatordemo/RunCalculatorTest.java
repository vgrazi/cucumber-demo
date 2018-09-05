package com.vgrazi.demo.calculatordemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber/calc.json",
                "html:target/cucumber/calc.html",
                "pretty"
        },

        tags = {"not @ignored"}
)
public class RunCalculatorTest {

}