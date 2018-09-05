package com.vgrazi.demo.cucumberdemo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import io.cucumber.datatable.DataTable;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class StepDefinitions {
    private Belly belly;
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
//        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hours?$")
    public void i_wait_hour(int time) throws Exception {
        belly.waitHours(time);
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        assertTrue("wrong!!!", belly.isGrowl());
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^my belly should not growl$")
    public void myBellyShouldNotGrowl() throws Throwable {
        assertFalse("wrong!!!", belly.isGrowl());
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^I should expect answer (\\w+)$")
    public void iShouldExpectAnswerAnswer(String result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(result, String.valueOf(belly.isGrowl()));
    }

    @Given("^I created a belly object$")
    public void iCreatedABellyObject() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        belly = new Belly();
    }

    @And("^I set the cukes to (\\d+)$")
    public void iSetTheCukesTo(int count) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        belly.eat(count);
    }

    @And("^I set the cukes to \"([^\"]*)\"$")
    public void iSetTheCukesTo(String countString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        int count = Integer.parseInt(countString);
        belly.eat(count);

    }

    @Given("^I add comment # (\\d+)")
    public void iAddComment(int arg0, String string) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg0 + " " + string);

    }

    @Given("^the following users exist:$")
    public void theFollowingUsersExist(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
