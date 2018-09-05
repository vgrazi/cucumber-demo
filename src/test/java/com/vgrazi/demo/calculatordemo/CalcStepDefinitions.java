package com.vgrazi.demo.calculatordemo;

import com.vgrazi.demo.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalcStepDefinitions {
    private Calculator calculator;
    private String result;

    @Given("^A blank calculator$")
    public void aBlankCalculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
    }

    @When("^parameter is \"([^\"]*)\"$")
    public void parameterIs(String param) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         result = calculator.calculate(param);
    }

    @Then("^Result should be \"([^\"]*)\"$")
    public void resultShouldBe(String result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(result, this.result);
    }
}
