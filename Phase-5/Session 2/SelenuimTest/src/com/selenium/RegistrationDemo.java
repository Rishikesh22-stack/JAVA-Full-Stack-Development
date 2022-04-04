package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shine.com/registration/parser/");

		WebElement name= driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Rishikesh Kulkarni");

		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("rishikeshkulkarni053@gmail.com");

		WebElement check=driver.findElement(By.cssSelector("#id_privacy"));
		if (!check.isSelected()) {
			check.click();
		}
	}
}
