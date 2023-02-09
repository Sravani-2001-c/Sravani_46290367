package TestCases;

import org.example.TestUtils.AndroidBaseTest;
import org.testng.annotations.Test;

public class POM1 extends AndroidBaseTest {
	@Test
	public void Options() throws InterruptedException {
	FormPage ep= new FormPage(driver);
	Thread.sleep(3000);
	ep.ClickName().sendKeys("Sravani");
	Thread.sleep(3000);
	ep.ClickGender().click();
	Thread.sleep(3000);
	ep.OptionCountry().click();
	ep.OptionCountryScroll();
	ep.OptionCountrySelect().click();
	ep.ClickShopBtn().click();
	Thread.sleep(3000);
	

}
}
