package com.simplilearn.testngselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest {
	@Test
  public void f() {
	  
	  WebDriver driver=null;
	    @Test(groups = "Chrome")
	    public void launchChrome() {
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        
	        try {
	            Thread.sleep(3000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    @Test(groups = "Chrome", dependsOnMethods = {"launchChrome"})
	    public void login() {
	        
	        driver.findElement(By.id("email")).sendKeys("sonam@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Sonam@123");
	        driver.findElement(By.name("login")).submit();
	        driver.close();
	    }
  }
}
