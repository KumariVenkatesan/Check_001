package com.app.sample;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	//Browser Launch // Action Method // CheckBox
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$uraj\\eclipse-workspace\\practice\\Selenium\\Source\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
//		driver.get("https://www.saucedemo.com/");
//	    WebElement username = driver.findElement(By.id("user-name"));
//	    username.sendKeys("standard_user");
//	    WebElement password = driver.findElement(By.name("password"));
//	    password.sendKeys("secret_sauce");
//		WebElement login = driver.findElement(By.id("login-button"));
//		        login.click();
	    System.out.println("Browser Launch");
//		Actions action = new Actions(driver);
//		WebElement cart1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
//		action.moveToElement(cart1).click().build().perform();
//		WebElement cart2 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		action.moveToElement(cart2).click().build().perform();
//		WebElement checkout = driver.findElement(By.id("checkout"));
//		action.moveToElement(checkout).click().build().perform();	
//		driver.close();
	    System.out.println("Actions Class");
	    
	    //checkbox and methods to print(CLick multiple boxes)(isDisplayed, isEnabled, isSelected)
//	    driver.get("https://www.leafground.com/checkbox.xhtml");
//		WebElement java = driver.findElement(By.xpath("//label[text ( ) ='Java']"));
//		java.click();
//		WebElement python = driver.findElement(By.xpath("//label[text ( ) = 'Python']"));
//		python.click();
	    //methods
//		boolean displayed = java.isDisplayed();
//		System.out.println(displayed);
//		boolean enabled = java.isEnabled();
//		System.out.println(enabled);
//		boolean selected = java.isSelected();
//		System.out.println(selected);
	    System.out.println("Methods");

	    //Css Selector
//	    driver.get("https://www.facebook.com/");
//		WebElement user = driver.findElement(By.cssSelector("input#email"));
//		user.sendKeys("iuatdahbayh");
//		WebElement pass = driver.findElement(By.cssSelector("input[name='pass']"));
//		pass.sendKeys("1635282");
//		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
//		login.click();
	    System.out.println("Css Selector");
	    
	    
	    //Radio Button( Using for options click)
//		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01uxlae7wk1o3o16m1wtbhchi0d348534.node0");
//		WebElement chrome = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
//		chrome.click();
//		WebElement safari = driver.findElement(By.xpath("(//label[text ( ) = 'Safari'])[2]"));
//		safari.click();
	    System.out.println("Radio Button");
	    
	   //popup
//		driver.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink#");
//		WebElement popupx = driver.findElement(By.xpath("//a[text ( ) = ' X ']"));
//		popupx.click();
		System.out.println("Popup");
		
		//Alerts
	    //Simple Alert
//		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0af91oa780j251q5upyfyi0wb6370486.node0");
//		WebElement simple = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
//		simple.click();
//		Thread.sleep(2000);
//		Alert simpleAlert = driver.switchTo().alert();
//		simpleAlert.accept();
//		Thread.sleep(3000);
//		System.out.println("1.Simple Alert");
//		//Confirm Dialogue Alert
//		WebElement confirm = driver.findElement(By.xpath("(//span[text ( ) = 'Show'])[2]"));
//		confirm.click();
//		Thread.sleep(3000);
		System.out.println("Simple Alert");
	   
//		drag and Drop
//		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01alzlbaevlh531ksy2gk7rg0wp393761.node0");
//		Actions action = new Actions(driver);
//		WebElement draggable = driver.findElement(By.xpath("//p[text()='Drag to target']"));
//		WebElement droppable = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
//		action.dragAndDrop(draggable, droppable).build().perform();
		//flipkart
		
//		driver.get("https://www.flipkart.com");
//		driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//following::a[4]")).click();
//		driver.findElement(By.xpath("//div[@class='bpjkJb']//following::span[3]")).click();
//		System.out.println("started");
//		if(driver.findElement(By.partialLinkText("Ethnic Wear")).isDisplayed()) {
//			System.out.println("STARTED");
//		System.err.println(driver.findElement(By.xpath("//div[@class=\"jzpKY6\"]//following::div[1]//child::a[@title='Kurtas & Kurtis']")).isDisplayed());
//		driver.findElement(By.xpath("//div[@class=\"jzpKY6\"]//following::div[1]//child::a[@title='Kurtas & Kurtis']")).click();
//		System.out.println("SELECTED");
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("(//div[text( ) = \"Dry Fruit, Nut & Seed\"])[1]")).click();
//		}
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text( ) = \"Today's Deals\"]")).click();
}
	
}



