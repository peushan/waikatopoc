package com.waikato.cucumber;

import com.waikato.base.BaseTest;
import com.wikato.pageobjects.InstructorRegister;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Map;


public class StepDefinition extends BaseTest {

	@Given("^I have open the browser$")
    public void I_have_open_the_browser() throws IOException {
    }

	@When("^I login to the application using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_login_to_the_application_using_and(String email, String password) {
        InstructorRegister instructorRegister = PageFactory.initElements(driver, InstructorRegister.class);
        //instructorRegister.register();

	}

	@Then("^Welcome page should be displayed$")
	public void Welcome_page_should_be_displayed() {
		tearDown();
	}

    @When("^I login to the application$")
    public void I_login_to_the_application(DataTable dataTable) {

        Map<String, String> datamap = dataTable.asMap(String.class, String.class);
        datamap.get("email");

    }

}
