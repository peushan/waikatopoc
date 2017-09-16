package com.wikato.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.waikato.base.BasePage;

public class SearchScreen extends BasePage{
	
	@FindBy(xpath="//a[@href='/become-an-instructor.html']")
	private WebElement lnkWritetoUs;

	public SearchScreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);	
	}
	
	
	public InstructorRegister navigateInstructor() {
		
		click(lnkWritetoUs);
		
		return new InstructorRegister(driver);
	}

}
