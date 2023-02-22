package com.travelocity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = "com.travelocity.stepdefinitions",
        features = "src/test/resources/features"
)
public class CucumberTestSuite {}
