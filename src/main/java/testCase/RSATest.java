package testCase;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
	 @Test
		public static void HomePageCheckFirefox() throws IOException, URISyntaxException {
	    	DesiredCapabilities dc = new DesiredCapabilities();
	    	dc.setBrowserName("firefox"); //alternatif yol
	    	//dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	    	dc.setPlatform(Platform.WINDOWS);
	    	//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			 WebDriver driver = new RemoteWebDriver(new URI("http://192.168.178.104:4444").toURL(),dc);		//http://192.168.178.104:4444/ 
			 driver.get("https://www.google.com/");
			 System.out.println(driver.getTitle());
			 driver.findElement(By.name("q")).sendKeys("Selenium");
			 driver.close();
		}
}
