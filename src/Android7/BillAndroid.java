package Android7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BillAndroid {

	final String USERNAME = "morso777";
	  final String ACCESS_KEY = "382f95cb-9410-40f2-8847-038d3ffa97f9";		  
	  final String URL = ("https://us1.appium.testobject.com/wd/hub");
	  
	  public void setUp() throws Exception {
	  //public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
				 	 
		DesiredCapabilities dc= new DesiredCapabilities();						
		dc.setCapability("testobject_api_key", "3A59DB5DE7E044F1A7760D67B4DB5005");
		
		
      dc.setCapability("platformName", "Android");
      dc.setCapability("platformVersion", "5.1");
      dc.setCapability("deviceName", "Motorola Moto E2");

      // Set allocation from private device pool only
      dc.setCapability("privateDevicesOnly", "true");
       
      // Set Application under test
      dc.setCapability("testobject_app_id", "7");
      dc.setCapability("name", "My Test 1!");

      // Set Appium version
      dc.setCapability("appiumVersion", "1.9.1");
      ;
      WebDriver driver = new RemoteWebDriver(new URL(URL), dc);			
		
							
		driver.quit();
	
	}
	
}
	

