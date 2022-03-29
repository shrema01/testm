package com.eco.qa.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/TestFeature.feature", glue = {"com/eco/qa/stepDefinition"})
public class CucumberRunner {
}
