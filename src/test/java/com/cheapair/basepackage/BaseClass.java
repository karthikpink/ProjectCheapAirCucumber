package com.cheapair.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	


	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}


	public static void selectByValue(WebElement ele , String value) {
		Select ss = new Select (ele);
		ss.selectByValue(value);
	}

	public static void selectByIndex(WebElement ele , int index) {
		Select ss = new Select (ele);
		ss.selectByIndex(index);
	}

		
	public static String getProperty(String Key) throws IOException {
		File file = new File("C:\\Users\\hp\\Eclipse1\\CheapAirBooking\\src\\test\\resources\\properties\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String property = prop.getProperty(Key);
		return property;
	}

	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void getwindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(allWindows);
//		for (String Windows : allWindows) {
//			list.add(Windows);
//		}
		driver.switchTo().window(list.get(1));
	}

}
