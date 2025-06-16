package com.app.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$uraj\\eclipse-workspace\\practice\\Selenium\\Source\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);

	 //Contains xpath
	driver.get("https://www.leafground.com/checkbox.xhtml");
    WebElement python = driver.findElement(By.xpath("(//label[contains(text(),'th')])[1]"));
	python.click();
}
}
