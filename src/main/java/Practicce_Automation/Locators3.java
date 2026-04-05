package Practicce_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/Dell/Desktop/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//sibling- child to parent to child
		//header/div/button[1]/following-sibling::button[1] - parent to child
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

	}

}
