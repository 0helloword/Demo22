package com.dbyl.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.DriverFactory;
import com.dbyl.libarary.utils.Locator;


public class EventTest extends BasePage {

	protected EventTest(WebDriver driver) throws Exception {
		super(driver);
		driver.get("http://www.w3school.com.cn/jsref/event_onblur.asp");
	}
	public void setValue(String msg) throws Exception
	{
		Locator input=new Locator("//input[@id='fname']");
		type(input,msg);
		Thread.sleep(10000);
		DOMEvent(input,"blur");
	
	}
	@Test(groups = "loginTest")
	public  void runTest( ) throws Exception
	{
		WebDriver driver=DriverFactory.getInstance().getFirefoxDriver();
		EventTest c=new EventTest(driver) ;
		c.setValue("abcde");
		   
	}
}
