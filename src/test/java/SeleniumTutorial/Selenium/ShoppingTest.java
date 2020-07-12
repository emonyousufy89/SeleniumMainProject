package SeleniumTutorial.Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ShoppingTest {  
	WebDriver driver;	
  @BeforeMethod //annotation
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");	
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.usps.com/");
		driver.manage().window().maximize();		
  }
  @Test
  public void testCardShopping() throws InterruptedException {
	  double expectedTotalPrice= 109.75;
	  Actions action = new Actions(driver);
		WebElement mailNship= driver.findElement(By.linkText("Mail & Ship"));
		action.moveToElement(mailNship);
		
		WebElement stamp = driver.findElement(By.linkText("Stamps & Supplies"));
		stamp.click();
		
		WebElement card = driver.findElement(By.xpath("//li//img[@src='https://www.usps.com/store/images/ps-subicon-cards.png']"));
		card.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Ptype = driver.findElement(By.xpath("//label[contains(text(),'Greeting & Note Cards (51)')]")); 
		js.executeScript("arguments[0].scrollIntoView();", Ptype);
		Ptype.click();
		
		WebElement Theme = driver.findElement(By.xpath("//label[contains(text(),'Commemorative (6)')]"));
		js.executeScript("arguments[0].scrollIntoView();", Theme);
		Theme.click();
		
		WebElement IssueYear = driver.findElement(By.xpath("//label[contains(text(),'2018 (2)')]"));
		js.executeScript("arguments[0].scrollIntoView();", IssueYear);
		IssueYear.click();
		
		WebElement quantity = driver.findElement(By.xpath("//label[contains(text(),'1 through 10 (2)')]"));
		js.executeScript("arguments[0].scrollIntoView();", quantity);
		quantity.click();
		
		WebElement color=driver.findElement(By.xpath("//div[@style='background-color:#228b22;']"));
		js.executeScript("arguments[0].scrollIntoView();", color);
		System.out.println("Color :" + color.getCssValue("background-color"));
		color.click();
		
		WebElement birds= driver.findElement(By.xpath("//div[contains(text(),'Birds in Winter Notecards')]"));
		js.executeScript("arguments[0].scrollIntoView();", birds);
		birds.click();
		
		WebElement quantity5=driver.findElement(By.xpath("//span[@class='quantity-stepup']"));
		for(int i=1;i<5;i++) {
		quantity5.   click();
		}
	
		WebElement price= driver.findElement(By.xpath("//span[@id='totalPrice']"));
		String actualvalstr= price.getText(); 
		String modstr=actualvalstr.replace("$", "");
		double actualdoubleval=Double.parseDouble(modstr);
		Assert.assertEquals(expectedTotalPrice,actualdoubleval);
		//String totalPrice= price.getText();
		System.out.println("The price of your order is :" + price.getText());
		
		WebElement date=driver.findElement(By.xpath("//span[@class='datecolor']"));
		String Date=date.getText();
		System.out.println("Your Issue Date is : " + Date);
		
		WebElement sku=driver.findElement(By.xpath("//span[@class='sku-id']"));
		String SKU=sku.getText();
		System.out.println("the SKU number is : " + SKU);
		
		WebElement addTocart=driver.findElement(By.xpath("//a[@id='addToCartVisBtn681966']"));
		addTocart.click();
		Thread.sleep(3000);
  }  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }



}
