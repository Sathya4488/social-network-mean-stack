

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
		System.setProperty("webdriver.chrome.driver", "/home/sathya/Downloads/chromedriver");
			driver.get("https://www.facebook.com/");  
					
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new ChromeDriver();  
		}		
		@AfterTest(enabled=false)
		public void afterTest() {
			driver.quit();			
		}		
}	