package com.waikato.cucumber;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.waikato.base.BaseTest;
import com.wikato.pageobjects.InstructorRegister;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class StepDefinition extends BaseTest {

	@Given("^I have open the browser$")
	public void I_have_open_the_browser() throws FileNotFoundException, IOException {
	}

	@When("^I login to the application using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_login_to_the_application_using_and(String arg1, String arg2) {
		InstructorRegister instructorRegister = PageFactory.initElements(driver, InstructorRegister.class);
		//instructorRegister.register();
	}

	@Then("^Welcome page should be displayed$")
	public void Welcome_page_should_be_displayed() {
		tearDown();
	}

}
