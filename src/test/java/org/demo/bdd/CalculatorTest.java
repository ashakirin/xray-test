package org.demo.bdd;

import io.cucumber.java8.En;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:org/demo/bdd/calculator.feature" })
public class CalculatorTest implements En {
}
