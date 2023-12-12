package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGGoogle {
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.out.println("Setting up");
		
	}
	@Parameters("url")
	
	@Test
	public void TestGoogle( String url) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(4000);
		String ExpectedTitle = "Google";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle); //using assertion to validate the output
		
		System.out.println("access google");
	}
	
	@Test
	public void TestNext() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		Thread.sleep(5000);
		driver.findElement(By.className("_6lux")).sendKeys("Meghabhatt", Keys.ENTER);
		driver.quit();
	}

}
