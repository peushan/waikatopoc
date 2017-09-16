package com.waikato.cucumber;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
features="features/LoginValidation.feature",format={"pretty","html:target/cucumber"})

public class CucumberRunner {
}
