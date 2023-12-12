package com.Listeners;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Listeners({ITestListenerClass.class})
public class NewTest {
	
	
	
  @Test
  public void testmethod1() {
	  System.out.println("TestMethod1");

  }
  @Test
  public void testmethod2() {
	  System.out.println("TestMethod2");
	  Assert.assertTrue(false);


  }
  
  @Test(dependsOnMethods= "testmethod2")
  public void testmethod3() {
	  System.out.println("TestMethod3");


  }
  @Test(timeOut = 1000)
  public void testmethod4() throws Exception {
	  Thread.sleep(2000);
	  System.out.println("TestMethod4");


  }
  
  

}
