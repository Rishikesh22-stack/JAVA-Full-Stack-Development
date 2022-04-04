package com.simplilearn.testngselenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AssersionsDemo {

	WebDriver driver = null;
	SoftAssert soft = null;

	@Test
	public void titleTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		soft.assertEquals("Facebook - log in or sign up", driver.getTitle());

		driver.close();
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
