package Android;

//import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Base extends base2 {
	
	public static void main(String[] args) throws MalformedURLException{
		
	AndroidDriver<AndroidElement> driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}

	}
		
	