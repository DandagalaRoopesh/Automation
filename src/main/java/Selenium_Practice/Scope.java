package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//give me the count of links on the page
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//give me the count of links in the footer section
		//System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		 //give me the count of links in the first column of the footer section
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		 //click on each link in the column and check if the pages are opening
		for(int i=1; i<column.findElements(By.tagName("a")).size(); i++)
			{
			Thread.sleep(1000);
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
	}

}
