package GitLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest {
	
	
		public static WebDriver driver;
		
		
		@BeforeMethod
		public void loginStart() {
			
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ANKITA\\Desktop\\OOPS\\GitWebdriverMaven\\src\\test\\resources\\executables\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");}
	
		
		@Test
		public void login() throws Throwable
		{
			System.out.println("hiiii");
			Thread.sleep(8000);
			System.out.println("khadoos");
			System.out.println("third changes in code to see git centralized flow");
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Amazon");
		}
	}


