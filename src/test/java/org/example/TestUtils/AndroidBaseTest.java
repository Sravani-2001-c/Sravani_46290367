package org.example.TestUtils;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.example.pageObjects.FormPage;
import org.example.utils.AppiumUtils;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AndroidBaseTest  {
	public AndroidDriver driver;
	public FormPage formPage;
	
	@BeforeClass(alwaysRun=true)
	public void ConfigureAppium() throws IOException,MalformedURLException
	{
		
			

			
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("SravaniPhone"); //emulator
			//options.setDeviceName("Android Device");// real device		
			
			options.setApp("C:\\Users\\user\\eclipse-workspace\\SravaniYakkala_46290367\\src\\test\\java\\org\\example\\resources\\General-Store.apk");
			options.setPlatformName("Android");
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			 formPage= new FormPage(driver);
	}
	
	


	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
        
		}
	public void scrollToText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	


}
