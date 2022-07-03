package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class TestBase {
    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//            caps.setCapability("app", "E:\\LapTrinh\\Appium\\English Dictionary Offline_v6.2-hcq3_apkpure.com.apk");
//            caps.setCapability("app", "livio.pack.lang.en_US/livio.pack.lang.en_US.DictionaryView");
            caps.setCapability("appPackage", "livio.pack.lang.en_US");
            caps.setCapability("appActivity", "livio.pack.lang.en_US.DictionaryView");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<>(url, caps);

            System.out.println("Before class");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    @AfterTest
    public void teardown() {
        System.out.println("After class");
    }
}
