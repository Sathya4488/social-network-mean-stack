

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	  //  private WebDriver driver;		
		@Test				
		public void testEasy() {	
		System.setProperty("webdriver.gecko.driver", ".drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://localhost:8888/Project/login");  
					
		}	
	/*
	 * @BeforeTest public void beforeTest() { driver = new FirefoxDriver(); }
	 * 
	 * @AfterTest(enabled=false) public void afterTest() { driver.quit(); }
	 */	
}	
