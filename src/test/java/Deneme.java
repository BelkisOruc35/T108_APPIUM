import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Deneme {


    AndroidDriver<AndroidElement> driver; //android cihazlarin driveri

    //  AppiumDriver<MobileElement> appiumDriver; //hem android de hem de ios da calisir
    final String cihazAdi="pixel2";
    final String platformIsmi="Android";
    final String version="10.0";
    final String automation="UiAutomator2";
    @BeforeTest

    public void deneme1() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel2");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.APP,"C:/Users/belkisoruc/IdeaProjects/Appium_T-108/Apps/Calculator_8.4 (503542421)_Apkpure.apk");
       driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
    public void carpma(){
       //driver.findElementByXPath("com.google.android.calculator:id/digit_8").click();
        driver.findElementByAccessibilityId("8").click();
        driver.findElementByAccessibilityId("0").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementByAccessibilityId("2").click();
        driver.findElementByAccessibilityId("0").click();
        String result= driver.findElementById("com.google.android.calculator:id/result_preview").getText();
        System.out.println(result);
        Assert.assertEquals(Integer.parseInt(result),1600);
        //git init
        //git add README.md
        //git commit -m "first commit"
        //git branch -M main
        //git remote add origin https://github.com/BelkisOruc35/T108_APPIUM.git
        //git push -u origin main

}}
