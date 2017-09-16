package com.wikato.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.waikato.base.BasePage;

public class HomeScreen extends BasePage {

	private final static Logger logger = Logger.getLogger(BasePage.class);

	@FindBy(xpath="//img[@alt='Search']")
	private WebElement Search;
	
	By locator = By.xpath("//a[@href='/become-an-instructor.html']");
	
	
	public HomeScreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public SearchScreen naviagteSearch() {
		logger.info("User can see the Home Screen");
		click(Search);
		logger.info("User click on the Search");

		waitforVisibility(locator, 10);

		return new SearchScreen(driver);
	}
}
