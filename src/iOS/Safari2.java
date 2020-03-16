package iOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Safari2 {
	
	  public static final String USERNAME = "morso777";
	  public static final String ACCESS_KEY = "382f95cb-9410-40f2-8847-038d3ffa97f9";
	
	  
	  public static final String URL = ("https://morso777:382f95cb-9410-40f2-8847-038d3ffa97f9@ondemand.saucelabs.com:443/wd/hub");
	 
	  public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
				 	 
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("OS", "12.0");
		dc.setCapability("browserName", "safari");
		dc.setCapability("version", "latest");			
		dc.setCapability("deviceName","iPhone 6");		
		dc.setCapability("deviceOrientation", "portrait");
		dc.setCapability("appiumVersion", "1.9.1");
		//dc.setCapability("platform", "MAC");
						
		WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
       	driver.get("https://medanswers.com");
		//System.out.println("title of page is: " + driver.getTitle());
		//Thread.sleep(8000L);
		driver.quit();
	
	}
}
