package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FormPage {
AndroidDriver driver;
	
	public FormPage(AndroidDriver driver) {
		this.driver=driver;
	}

	By Name=By.id("com.androidsample.generalstore:id/nameField");
	public WebElement ClickName() {
		return driver.findElement(Name);			
	}
	
	
	By Gender=By.id("com.androidsample.generalstore:id/radioFemale");
	public WebElement ClickGender() {
		return driver.findElement(Gender);			
	}

	By CountryOption=By.id("android:id/text1");
	public WebElement OptionCountry() {
		return driver.findElement(CountryOption);			
	}
	By CountryScroll=AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	public WebElement OptionCountryScroll() {
		return driver.findElement(CountryScroll);			
	}
	
	By CountrySelect=By.xpath("//android.widget.TextView[@text='Argentina']");
	public WebElement OptionCountrySelect() {
		return driver.findElement(CountrySelect);			
	}
	
	
	
	By ShopBtn=By.id("com.androidsample.generalstore:id/btnLetsShop");
	public WebElement ClickShopBtn() {
		return driver.findElement(ShopBtn);			
	}
	
}
