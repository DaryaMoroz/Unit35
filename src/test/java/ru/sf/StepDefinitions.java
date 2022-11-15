package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {
    private static String opinion;
    private static String answer;

    @Given("we have an opinion about lesson that it {string}")
    public void we_have_an_opinion_about_lesson_that_it(String string) {
        this.opinion = string;
    }

    @When("I have asked if this lesson is clear?")
    public void i_have_asked_if_this_lesson_is_clear() {
        this.answer = check.ifClear(opinion);
    }

    @Then("I have got an answer {string}")
    public void i_have_got_an_answer(String string) {
       assertEquals(string, answer);
    }
}
