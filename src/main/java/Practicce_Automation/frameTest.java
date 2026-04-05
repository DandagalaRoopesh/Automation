package Practicce_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class = 'demo-frame']")));
		//driver.findElement(By.cssSelector("div[id = 'draggable']")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div[id = 'draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id = 'droppable']"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}
