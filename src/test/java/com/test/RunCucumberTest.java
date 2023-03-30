package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "summary, pretty, html:target/cucumber-reports/report.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.test.config, com.test.data, com.test.pages, com.test.steps, com.test.api")
//or
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    plugin = {"summary", "pretty"},
//    features = "classpath:features",
//    glue = {"com.test.config","com.test.data", "com.test.pages","com.test.steps"}
//)
public class RunCucumberTest {

}

