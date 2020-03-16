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
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceSafariIOS {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
					
	DesiredCapabilities dc=DesiredCapabilities.iphone();		
	dc.setCapability("deviceName","iPhone 6");	
	dc.setCapability("platform", "MAC");
	dc.setCapability("browserName", "safari");
	dc.setCapability("version", "latest");	
	dc.setCapability("deviceOrientation", "portrait");
	dc.setCapability("platformVersion", "12.1.2");
		dc.setCapability("platformName", "iOS");				
		dc.setCapability("appiumVersion", "1.9.1");
			
		//dc.setCapability("OS", "12.1.2");		
		//dc.setCapability("platform", "MAC");
		//dc.setCapability("version", "latest");
		//IOSDriver driver=new IOSDriver(new URL("https://morso777:382f95cb-9410-40f2-8847-038d3ffa97f9@ondemand.saucelabs.com:80/wd/hub"),dc); 
		//IOSDriver driver=new IOSDriver(new URL("https://morso777:A6BB6F58D56B4484A46FA4F7F74A3132@ondemand.saucelabs.com:80/wd/hub"),dc);
		IOSDriver driver=new IOSDriver(new URL("https://morso777:5F6CBB456C9F4DB1B65DFFCE79802C7C@ondemand.saucelabs.com:80/wd/hub"),dc);
		driver.get("https://google.com");
		Thread.sleep(8000L);

		}
		}
		
/*DesiredCapabilities dc=DesiredCapabilities.iphone();
dc.setCapability("platformName", "iOS");
dc.setCapability("platformVersion", "12.1.2");		
dc.setCapability("appiumVersion", "1.9.1");
dc.setCapability("deviceName","iPhone_6_free");
dc.setCapability("browserName", "safari");
dc.setCapability("deviceOrientation", "portrait");
IOSDriver driver=new IOSDriver(new URL("https://eu1.appium.testobject.com/wd/hub"),dc);*/
		
		

/*DesiredCapabilities dc=DesiredCapabilities.iphone();
dc.setCapability("platformName", "iOS");
dc.setCapability("platformVersion", "12.1.2");		
dc.setCapability("appiumVersion", "1.8.1");
dc.setCapability("deviceName","iPhone_6_free");
dc.setCapability("browserName", "safari");
dc.setCapability("deviceOrientation", "portrait");
IOSDriver driver=new IOSDriver(new URL("https://morso777:A6BB6F58D56B4484A46FA4F7F74A3132@ondemand.saucelabs.com:80/wd/hub"),dc);*/





		/*DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "12.1.2");		
		dc.setCapability("appiumVersion", "1.8.1");
		dc.setCapability("deviceName","iPhone_6_free");
		dc.setCapability("browserName", "safari");
		dc.setCapability("deviceOrientation", "portrait");
		IOSDriver driver=new IOSDriver(new URL("https://morso777:5F6CBB456C9F4DB1B65DFFCE79802C7C@ondemand.saucelabs.com:80/wd/hub"),dc); */
		
		
		
		/*DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "12.1.2");		
		dc.setCapability("appiumVersion", "1.5.1");
		dc.setCapability("deviceName","iPhone_6_free");
		dc.setCapability("browserName", "safari");
		dc.setCapability("deviceOrientation", "portrait");
		IOSDriver driver=new IOSDriver(new URL("https://morso777:A6BB6F58D56B4484A46FA4F7F74A3132@ondemand.saucelabs.com:443/wd/hub"),dc);   */
		
		
	
