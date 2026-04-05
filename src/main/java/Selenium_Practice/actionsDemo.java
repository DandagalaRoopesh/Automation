package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(By.cssSelector("a[id = 'nav-link-accountList']"))).build().perform();
		 
		 
	}

}
