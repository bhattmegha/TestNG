package com.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest {
	
	
	@Test(dataProvider = "LoginTestData")
	public void loginHRM(String UserName, String Password) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		String Expected = "Dashboard";
		String actual = driver.findElement(By.className("oxd-topbar-header-title")).getText();
		Assert.assertEquals(actual, Expected);
		driver.quit();
		
		
		
	}
	@DataProvider(name = "LoginTestData", parallel = true)
	public Object[][] setofdata() {
		
		Object[][] loginData = new Object[4][2];
		
		loginData[0][0] = "Admin";
		loginData[0][1] = "admin123";
		
		loginData[1][0] = "Admin";
		loginData[1][1] = "Admin";
		
		loginData[2][0] = "Admin1";
		loginData[2][1] = "Admin";
		
		loginData[3][0] = "Admin3";
		loginData[3][1] = "Admin";
		
		return loginData;
	}

}
  