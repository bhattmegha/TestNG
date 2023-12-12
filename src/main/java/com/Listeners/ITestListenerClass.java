package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestStarted");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestSFailure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFInish");

	}
	
	
	

	
	

}
