package footerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonBaseData.Base;

public class Check_contact_link extends Base{
	
	@Test
	public void click_on_contact() {
		driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
	}
	

}
