package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reportNew.json",
                "pretty"
        },

        features = "src/test/resources/features", // stands for features package
        glue = "com/cydeo/step_definitions", //stands for step definition package
        dryRun = false,
        tags = "@assignment"

)
public class CukesRunner {

}
