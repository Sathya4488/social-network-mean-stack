

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	    public WebDriver driver;		
		@Test				
		public void testEasy() {	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver.get("https://www.facebook.com/");  
					
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
