package org.demo.bdd;

import io.cucumber.java8.En;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = { "classpath:org/demo/bdd/calculator.feature" },
//        plugin = { "json", "json:target/cucumber-reports/Cucumber.json" },
//        monochrome = true)
@CucumberOptions(features = { "classpath:org/demo/bdd/1.feature" },
        plugin = { "json", "json:target/cucumber-reports/Cucumber.json" },
        monochrome = true)
public class CalculatorTest implements En {
}
