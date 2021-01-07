package GitLearning;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class shoesSearch extends Base {
	
	@BeforeClass
	public void loginStart() {
	System.out.println("hiii2");
	driver.manage().deleteAllCookies();
		
	}
	
	
	@Test
	public void login() throws Throwable
	{
		System.out.println("hiiii2");
		Thread.sleep(8000);
	
		System.out.println("third changes in code to see git centralized flow");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("shoes");
	}
	
	@AfterClass
	public void quit() {
		System.out.println("quit2");
		driver.quit();
	}
}


