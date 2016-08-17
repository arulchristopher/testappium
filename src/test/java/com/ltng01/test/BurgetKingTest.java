package com.ltng01.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BurgetKingTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Lenovo K50a40");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		
		File appFile=new File("/home/linux/pull_android_apk/bk-mobile-native.apk");
		 
		//cap.setCapability("app", appFile.getAbsolutePath());
		//cap.setCapability("appPackage", "app.zerofact.com.zerofact");
		//cap.setCapability("appActivity", "app.zerofact.com.zerofact.MainActivity");
		//cap.setCapability("appPackage", "com.ajay.internetcheckapp");
		//cap.setCapability("appActivity", "com.ajay.internetcheckapp.result.ui.phone.intro.IntroActivity");
		cap.setCapability("appPackage", "in.redbus.android");
		cap.setCapability("appActivity", "in.redbus.android.root.SplashScreen");
				
		
		//in.redbus.android/in.redbus.android.root.HomeScreen}
		
		//com.ajay.internetcheckapp
		//com.ajay.internetcheckapp.result.ui.phone.intro.IntroActivity
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		Thread.sleep(12000);
		
		Set<String> context = driver.getContextHandles();
		//Iterator contextInfo=context.iterator();
		
		System.out.println(context);
		for(String x : context){
			System.out.println(x);
		}
		System.out.println("END");
		
		//driver.findElementByXPath("*[@content-desc='IMAGES']").click();

		//driver.close();
	}

}
