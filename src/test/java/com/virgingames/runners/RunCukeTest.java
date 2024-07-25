package com.virgingames.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/virgingames/steps"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
