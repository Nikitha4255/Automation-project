package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class wpjobbase {

	protected WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/");
		driver.manage().window().maximize();
}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	