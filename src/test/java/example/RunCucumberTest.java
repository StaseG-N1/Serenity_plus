package example;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",glue = {"example.stepdefinitions"})
public class RunCucumberTest {}