package testCase;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException, InterruptedException
    {
    	System.out.println("-----------Firefox------------");
        HomePageCheck();
        Thread.sleep(2000);
        System.out.println("-----------Firefox------------");
        RSATest.HomePageCheckFirefox();
        System.out.println("------------------------------");
    }
    @Test
	public static void HomePageCheck() throws IOException, URISyntaxException {
    	DesiredCapabilities dc = new DesiredCapabilities();
    	//dc.setBrowserName("chrome"); //alternatif yol
    	dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
    	dc.setPlatform(Platform.WINDOWS);
    	//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 WebDriver driver = new RemoteWebDriver(new URI("http://192.168.178.104:4444").toURL(),dc);		//http://192.168.178.104:4444/ 
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.close();
	}
   
}
