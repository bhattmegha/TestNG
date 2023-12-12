package com.test;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMDemo {
	
	 static WebDriver driver;
	@Test
	public void LaunchBrowser()throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title is" + " " + (driver.getTitle()));
		Thread.sleep(5000);
		//driver.quit();
		
	}
	
	@Test
	public void LoginDetails() throws InterruptedException  {
		
		System.out.println("testing");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//driver.quit();
	}
	
	@Test
	public void VerifyLogin() {
		
		WebElement Text = driver.findElement(By.className("oxd-topbar-header-breadcrumb"));
		System.out.println(Text.isDisplayed());
		System.out.println(Text.getText());
		
		
		
	}
	
	@Test
	public void VerifyMyInfo() {
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		System.out.println(driver.findElement(By.xpath("//h6[text()='PIM']")).getText());
		driver.quit();
		
	}

}
