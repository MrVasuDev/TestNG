package com.Step_Definitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "com.Step_Definitions",
monochrome = true,
tags = "@smoke or @functional or @functional1 or @functional2",
plugin = {"pretty","html:target/Html-Report/report.html",
		"json:target/JsonReports/report.json",
		"junit:target/JunitReports/report.xml"})


public class TestRunner {

}
