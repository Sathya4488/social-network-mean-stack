

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
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://www.google.com");  
					
		}	
	/*
	 * @BeforeTest public void beforeTest() { driver = new FirefoxDriver(); }
	 * 
	 * @AfterTest(enabled=false) public void afterTest() { driver.quit(); }
	 */	
}	
