package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
