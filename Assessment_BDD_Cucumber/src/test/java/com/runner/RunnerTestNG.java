package com.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true
)

public class RunnerTestNG extends  AbstractTestNGCucumberTests {
 
	@DataProvider(parallel = true)

    public Object[][] scenarios() {

        return super.scenarios();
    }
}
