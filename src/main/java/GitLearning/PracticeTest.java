package GitLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTest extends Base {
	
	
	
	
	
		
		@BeforeClass
		public void loginStart() {
		System.out.println("hiii1");
		driver.manage().deleteAllCookies();
			
		}
		
		
		@Test
		public void login() throws Throwable
		{
			
			
			System.out.println("third changes in code to see git centralized flow");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Amazon");
			Thread.sleep(10000);
			System.out.println("click done");
		}
		
		@Test(priority=2)
		public void searchClick() {
			System.out.println("inside searchClick");
			driver.findElement(By.xpath("//input[@name='btnK']")).click();
		}
		
		
		@AfterClass
		public void quit() {
			System.out.println("quit1");
			driver.quit();
		}
	}


