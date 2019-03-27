

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	    		
		@Test				
		public void testEasy() {	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");  
					
		}	
			
}	
