package com.simplilearn.testngselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver=null;
	}

	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rishike@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rishikesh1998");
		driver.findElement(By.name("login")).submit();
		driver.close();
	}

}
