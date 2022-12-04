package org.demo.bdd;

import io.cucumber.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions implements En {
    private int result = 0;
        public CalculatorStepDefinitions() {
            Given("I have a calculator", () -> {
                // Write code here that turns the phrase above into concrete actions
                ;
            });
            When("I add {int} and {int}", (Integer int1, Integer int2) -> {
                // Write code here that turns the phrase above into concrete actions
                result = int1 + int2;
            });
            Then("I should get {int}", (Integer int1) -> {
                // Write code here that turns the phrase above into concrete actions
                assertThat(result).isEqualTo(int1);
            });
    }
}
