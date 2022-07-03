package test;

import common.Constant;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class TC01 extends TestBase{


    @Test
    public void TC01() {
        System.out.println("Inside test");

        By home =By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");
        By buttonOK =By.xpath("//*[@text='OK']");
        By wod =By.id("livio.pack.lang.en_US:id/wod");
//        By buttonExit =By.id("livio.pack.lang.en_US:id/item_name");
        By buttonExit =By.xpath("//android.widget.TextView[@text='Exit']");

//        sleep(5000);
        driver.findElement(buttonOK).click();

        driver.findElement(wod).click();

        driver.findElement(home).click();
        driver.findElement(buttonExit).click();




        System.out.println("Inside test");

    }



}
