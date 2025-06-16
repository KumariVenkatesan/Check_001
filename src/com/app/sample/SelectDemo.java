package com.app.sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$uraj\\eclipse-workspace\\practice\\Selenium\\Source\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/select-menu");//dropdown method
//		WebElement singleDrop = driver.findElement(By.id("oldSelectMenu"));
//		Select select = new Select(singleDrop);
//		List<WebElement> options = select.getOptions();//print the console
//		System.out.println(options);
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//			
//		}
//		select.selectByIndex(4);// index bases
//		Thread.sleep(2000);
		
//		select.selectByValue("6");//value mentioned bases
//		Thread.sleep(2000);
//		select.selectByVisibleText("Indigo");
//		System.out.println("single drop down ended");
//		boolean multiple = select.isMultiple();
//		System.out.println(multiple);
		//getAllselectedopions
		//getFirstSelectedoptions
		//deSelectAll these methods are not applicable for single drop down
		
		//applicable for multpledrop down method
//		selectByValue()
//		selectByIndex()
//		selectByvisibleText()
//		GetOptions()
//		getAllselectedOptions()
//		getFirstSelectedOption()
//		isMultiple()
//		deSelectByValue()
//		deSelectByIndex()
//		deSelectByvisibleText()
//		deSelectAll()
		
		
		
		driver.get("https://www.facebook.com/");
//		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\$uraj\\eclipse-workspace\\practice\\Selenium\\Screenshot\\login5_" + timestamp + ".jpeg");
////		org.openqa.selenium.io.FileHandler.copy(source, destination);//used in version 3
//			FileUtils.copyFile(source, destination);	//Version 2
//		driver.get("https://demoqa.com/select-menu");
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File place = ts.getScreenshotAs(OutputType.FILE);
//		File form = new File("C:\\Users\\$uraj\\eclipse-workspace\\practice\\Selenium\\Screenshot\\login6_" + timestamp + ".jpeg");
//		FileUtils.copyDirectory(place, form);
		
//		String timestamp = new SimpleDateFormat("YYYYMMdd+HHmmss").format(new java.util.Date());
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
	}
}
