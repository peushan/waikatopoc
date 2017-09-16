package com.wikato.pageobjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.waikato.base.BasePage;

public class InstructorRegister extends BasePage {

    private final static Logger logger = Logger.getLogger(BasePage.class);

	@FindBy(xpath = "//input[@id='input_1']")
	WebElement txtName;

	@FindBy(id = "input_2")
	WebElement txtEmail;

	@FindBy(id = "input_3")
	WebElement txtartical;

	@FindBy(xpath = "//div[@id='cid_7']")
	WebElement btnBrowse;

	@FindBy(id = "input_5")
	WebElement btnsubmit;

	@FindBy(id = "JotFormIFrame-71343386835462")
	WebElement frame1;
	
	@FindBy(xpath="//div[@class='form-error-message']")
	WebElement error1;

	public InstructorRegister(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}

	public void register(String name, String emial, String artical) throws IOException {

		try {
			driver.switchTo().frame(frame1);
			sendKeys(txtName, name);
			sendKeys(txtEmail, emial);
			sendKeys(txtartical, artical);
			//System.out.println(error1.getText());
			click(btnBrowse);
			sleep(2);
			Runtime.getRuntime().exec("C:\\Peushan\\Fileupload.exe");
			
		} catch (NoSuchElementException e) {
			
			sendKeys(txtName, name);
			sendKeys(txtEmail, emial);
			sendKeys(txtartical, artical);
			sleep(1);
		}

		// click(btnBrowse);
	}

}
