/*install Auto IT 
--------------------------------------
install with the default values
------------------------------------
open auto It tool

also to write a script --> C:/programfiles(86)/autoIt3/SciTe/Scite.exe
--------------------------------------------------------------------------
create new file and edit with the required commands (command title, ID you can find out using that finder option)

ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1","D:\Sonam Data\personal\CV\SonamCV.doc");
ControlClick("Open","","Button1")
--------------------------------------------------------------------
Save with .au3 extension

right on that file and compile to (64 or 86 as per your System)

---------------------------------------------------------------------------
write a JAVA code to execute this script for automate testing*/

package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");

		WebElement name = driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Sonam Soni");

		WebElement upload = driver.findElement(By.cssSelector("#id_file"));
		// clicking on upload button
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", upload);

		Thread.sleep(5000);

		Runtime.getRuntime().exec("D:\\Selenium\\fileuploadRoutine.exe");
	}
}

/*
 * -----------------------------------------------------------------------------
 * execute the same and check out put.
 */