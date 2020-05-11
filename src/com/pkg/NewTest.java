package com.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
		WebDriver driver;

		@BeforeMethod
		public void LOunch() {
			System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
		}
		@Test
		public void login() {
			System.out.println("that is correct");
		}
		
		@Test
		public void loout() {
			System.out.println("that is not correct");
		}
		@AfterMethod
		public void exit() {
			driver.quit();
}
}
