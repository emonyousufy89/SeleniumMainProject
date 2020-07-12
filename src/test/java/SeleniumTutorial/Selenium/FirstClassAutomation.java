package SeleniumTutorial.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstClassAutomation {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.usps.com/");
		driver.manage().window().maximize();
		
		List <WebElement> listofAllLinks1 = driver.findElements(By.tagName("a"));
		int noOflinkss=listofAllLinks1.size();
		
		System.out.println("No of list if my home page " + noOflinkss);
		
		
		// ****** using id locator *****
		//WebElement scrBox = driver.findElement(By.id("home-input"));	
		// **** using name ***** // if name is not unique we have to use findelements
		//WebElement scrBox = driver.findElement(By.name("keyword")); // wont work cause name is not unique	
		//class=" search--track-input form-control" //using class name
		//WebElement scrBox = driver.findElement(By.className("search--track-input form-control"));
		
		/// *** using xpath locator ***
		/*WebElement scrBox = driver.findElement(By.xpath("//input[@id='home-input']"));
		Thread.sleep(2000);
		scrBox.sendKeys("1234556788999874");
		Thread.sleep(2000);*/
		
		// ***** Click the whole name
		//WebElement clickNship = driver.findElement(By.linkText("Click-N-Ship®"));
		//clickNship.click();
		// *** Click the partial name
		//WebElement clickNship = driver.findElement(By.partialLinkText("Click"));
		//clickNship.click();
		//*** using text box in web page ****
		//WebElement Sbox = driver.findElement(By.xpath("//h2[contains(text(),'Search or Track Packages']"));
		//String header= Sbox.getText();
		// *** searche by the text box 
//		WebElement Sbox = driver.findElement(By.xpath("//h2[contains(text(),'Search or Track Packages')]"));
//		String header= Sbox.getText();
//		
//		System.out.println("The header is :" + header);
//	
//		
		/*
		System.out.println("No of list if my home page " + noOflinks);
		
		Actions action = new Actions (driver);
		WebElement mailAndship= driver.findElement(By.linkText("Mail & Ship"));
		action.moveToElement(mailAndship);
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.linkText("Stamps & Supplies"));
		action.moveToElement(subMenu);
		action.click().build().perform();
		
		Thread.sleep(2000);
		driver.quit();*/
		
	}



}
