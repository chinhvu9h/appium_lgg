package driver;

import common.Constant;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Driver {

    public void start() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability("app", "E:\\LapTrinh\\Appium\\English Dictionary Offline_v6.2-hcq3_apkpure.com.apk");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            Constant.DRIVER = new AppiumDriver<>(url, caps);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void quit() {
        Constant.DRIVER.quit();
    }

}
