/**
 * 
 */
package com.amazon.base;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author elijoh01
 *
 */
public class BaseClass {
	
	WebDriver driver;
	@BeforeTest
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/elijoh01/eclipse-workspace/TestAmazon1/lib/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void testCase1()
	{
		driver.findElement(By.id("q")).sendKeys("Test");
		//TakesScreenshot takeScreenShot=(TakesScreenshot) driver;
	}
	
	//@BeforeMethod
	/*public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./lib/ChromeDriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
	}
	@Test
	public void testCase1()
	{
		driver.findElement(By.id("q")).sendKeys("Test");
		//TakesScreenshot takeScreenShot=(TakesScreenshot) driver;
	}*/
}
