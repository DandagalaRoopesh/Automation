package Practicce_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
// TestNg is one of the framework used to build testing frameworks
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled())
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ct100_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);
		for (int i = 1; i < 2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult");
			
			
			
			//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			//driver.findElement(By.cssSelector(.ui-state-default.ui-state-highlight.ui-state-active)).click();`
			// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

			// count the number of checkboxes
		}

	}

}
