package com.wikato.register;

import java.io.IOException;
import java.util.Map;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.waikato.base.BaseTest;
import com.waikato.util.CsvDataProvider;
import com.wikato.pageobjects.HomeScreen;
import com.wikato.pageobjects.InstructorRegister;
import com.wikato.pageobjects.SearchScreen;

public class Test1 extends BaseTest {

	@Test(dataProvider = "CsvDataProvider", dataProviderClass = CsvDataProvider.class)
	public void RegistrationTest(Map<String, String> testData) throws IOException {

		String no = testData.get("no");
		String name = testData.get("studentname");
		String class1 = testData.get("class");

		SoftAssert sAssert = new SoftAssert();
		
		HomeScreen homeScreen = new HomeScreen(driver);
		SearchScreen searchScreen = homeScreen.naviagteSearch();
		InstructorRegister instructorRegister = searchScreen.navigateInstructor();
		instructorRegister.register(no, name, class1);

		sAssert.assertAll();

	}
}
