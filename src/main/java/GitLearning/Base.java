package GitLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	
	public Base(){
		if(driver==null) {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\IEDriverServer.exe");
	
        driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}}

}
