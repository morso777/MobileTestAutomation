package Android5;

import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class openbrowsermobile {

	//	public class ChromeTest {
	 
		public static void main(String[] args) {
			
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Morso");
			caps.setCapability("udid", "4200270cec18a200"); //Give Device ID of your mobile phone
			//caps.setCapability("udid", "ZY3228XZKN");
			caps.setCapability("platformName", "Android");
			//caps.setCapability("platformVersion", "7.1.1");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("noReset", true);
			
			//Set ChromeDriver location
			System.setProperty("webdriver.chrome.driver","D:\\PROGRAMAS\\Browser driver\\chromedriver.exe");
			
			//Instantiate Appium Driver
			AppiumDriver<MobileElement> driver = null;
			try {
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
					
			//Open URL in Chrome Browser
			driver.get("https://www.google.com");
			
			//driver.findElementByClassName("android.widget.EditText").sendKeys("hola");
			
			//driver.findElementById("com.bt.bms:id/btnLogin").click();
			//driver.findElementById("com.bt.bms:id/btnSignUp").click();
		    int s=driver.findElements(By.className("android.widget.EditText")).size();
			System.out.println(s);
			List<MobileElement>a=driver.findElements(By.className("android.widget.EditText"));
			a.get(0).sendKeys("Appium");
			
			driver.quit();
			
			
			
			
		}

}
