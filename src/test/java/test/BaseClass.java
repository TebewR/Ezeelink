package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException{
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//		caps.setCapability(MobileCapabilityType.APP, "");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            caps.setCapability("noReset", "TRUE");
            caps.setCapability("app", "D:\\AutomationTesting\\Ezeelink\\src\\main\\resources\\app-staging-debug.apk");
//		caps.setCapability("appPackage", "com.ezee.main");
//		caps.setCapability("appActivity", "com.ezee.main.activities.v2.SignInActivity");

            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            driver = new AndroidDriver<MobileElement>(url,caps);

        }catch(Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }

    }

    @Test
    public void test(){
        System.out.println("I'm Inside the Test");
    }

    @AfterTest
    public void tearDown(){
//        driver.close();
    }
}
