package Android4;

import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends Base {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
				
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//Tap
		TouchAction t =new TouchAction(driver);		
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
					
	}

}

	

