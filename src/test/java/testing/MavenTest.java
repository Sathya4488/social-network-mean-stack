

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	    		
		@Test				
		public void testEasy() {	
		System.setProperty("webdriver.chrome.driver", "/home/sathya/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");  
					
		}		
}	
