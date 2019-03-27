

package testing;		

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class MavenTest {		
	    		
		@Test
 public void f() {
 
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
WebDriver driver = new FirefoxDriver();  
/*
* DesiredCapabilities capability = DesiredCapabilities.chrome();
* capability.setCapability("webdriver.chrome.binary",
* "C:\\Users\\river\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
* driver = new ChromeDriver(capability);
*/

 //ChromeOptions chromeOptions= new ChromeOptions();
   //chromeOptions.setBinary("C:\\Users\\river\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
// ChromeDriver driver = new ChromeDriver(chromeOptions);
 driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
 WebElement gmail= driver.findElement(By.id("identifierId"));
 gmail.sendKeys("msbalan888@gmail.com");
 WebElement next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
 next.click();
			
}	
