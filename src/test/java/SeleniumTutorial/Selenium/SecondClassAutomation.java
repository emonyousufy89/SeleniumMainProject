package SeleniumTutorial.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondClassAutomation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.usps.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement mailNship= driver.findElement(By.linkText("Mail & Ship"));
		action.moveToElement(mailNship);
		Thread.sleep(2000);
		
		WebElement stamp = driver.findElement(By.linkText("Stamps & Supplies"));
		Thread.sleep(2000);
		stamp.click();
		Thread.sleep(2000);
		
		WebElement card = driver.findElement(By.xpath("//li//img[@src='https://www.usps.com/store/images/ps-subicon-cards.png']"));
		Thread.sleep(2000);
		card.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Ptype = driver.findElement(By.xpath("//label[contains(text(),'Greeting & Note Cards (52)')]")); 
		js.executeScript("arguments[0].scrollIntoView();", Ptype);
		Thread.sleep(2000);
		Ptype.click();
		Thread.sleep(2000);
		
		WebElement Theme = driver.findElement(By.xpath("//label[contains(text(),'Commemorative (6)')]"));
		js.executeScript("arguments[0].scrollIntoView();", Theme);
		Thread.sleep(2000);
		Theme.click();
		Thread.sleep(2000);
		
		WebElement IssueYear = driver.findElement(By.xpath("//label[contains(text(),'2018 (2)')]"));
		js.executeScript("arguments[0].scrollIntoView();", IssueYear);
		Thread.sleep(2000);
		IssueYear.click();
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.xpath("//label[contains(text(),'1 through 10 (2)')]"));
		js.executeScript("arguments[0].scrollIntoView();", quantity);
		Thread.sleep(2000);
		quantity.click();
		Thread.sleep(2000);
		
		WebElement color=driver.findElement(By.xpath("//div[@style='background-color:#228b22;']"));
		js.executeScript("arguments[0].scrollIntoView();", color);
		System.out.println("Color :" + color.getCssValue("background-color"));
		Thread.sleep(2000);
		color.click();
		Thread.sleep(2000);
		
		WebElement birds= driver.findElement(By.xpath("//div[contains(text(),'Birds in Winter Notecards')]"));
		js.executeScript("arguments[0].scrollIntoView();", birds);
		Thread.sleep(2000);
		birds.click();
		Thread.sleep(2000);
		
		WebElement quantity5=driver.findElement(By.xpath("//span[@class='quantity-stepup']"));
		for(int i=1;i<5;i++) {
		quantity5.click();
		}
	
		WebElement price= driver.findElement(By.xpath("//span[@id='totalPrice']"));
		String totalPrice= price.getText();
		System.out.println("The price of your order is :" + totalPrice);
		
		WebElement date=driver.findElement(By.xpath("//span[@class='datecolor']"));
		String Date=date.getText();
		System.out.println("Your Issue Date is : " + Date);
		
		WebElement sku=driver.findElement(By.xpath("//span[@class='sku-id']"));
		String SKU=sku.getText();
		System.out.println("the SKU number is : " + SKU);
		
		WebElement addTocart=driver.findElement(By.xpath("//a[@id='addToCartVisBtn681966']"));
		Thread.sleep(2000);
		addTocart.click();
		Thread.sleep(2000);

	}



}
