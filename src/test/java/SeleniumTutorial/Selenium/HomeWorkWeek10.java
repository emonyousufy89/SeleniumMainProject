package SeleniumTutorial.Selenium;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkWeek10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.usps.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement mailNship= driver.findElement(By.linkText("Mail & Ship"));
		action.moveToElement(mailNship);
		WebElement stamp = driver.findElement(By.linkText("Stamps & Supplies"));
		action.moveToElement(stamp);
		action.click().build().perform();
		WebElement card = driver.findElement(By.partialLinkText("Cards"));
		action.moveToElement(card);
		action.click().build().perform();
		WebElement greetings = driver.findElement(By.xpath("//li[@class='nav-filter-item']//label[@for='checkbox-type-Product Type-Greeting & Note Cards-52']")); 
		//WebElement greetings = driver.findElement(By.id(checkbox-type-Product Type-Greeting & Note Cards-27")); //*****by Id & name	
		action.moveToElement(greetings);
		action.click().build().perform();
		WebElement Theme = driver.findElement(By.xpath("//input[@id='checkbox-type-Theme-Commemorative-6']"));
		// WebElement Theme = driver.findElement(By.id("checkbox-type-Theme-Commemorative-6"));  // *****8by id & name
		action.moveToElement(Theme);
		action.click().build().perform();
		WebElement IssueYear = driver.findElement(By.xpath("//input[@id='checkbox-type-Issue Year-2018-2']"));
		//WebElement IssueYear = driver.findElement(By.id("checkbox-type-Issue Year-2018-2")); //******by id & name
		action.moveToElement(IssueYear);
		action.click().build().perform();
		WebElement quantity = driver.findElement(By.xpath("//input[@id='checkbox-type-Quantity-1 through 10-2']"));
		action.moveToElement(quantity);
		action.click().build().perform();
		
		WebElement color=driver.findElement(By.xpath("//div[@class='result-color-container']//div[@style='background-color:#d10000;']"));
		action.moveToElement(color);
		action.click().build().perform();
		
		WebElement birds= driver.findElement(By.xpath("//a[@href='/store/product/cards-envelopes/birds-in-winter-notecards-S_681966']//div[@class='results-product-desc']"));
		action.moveToElement(birds);
		action.click().build().perform();
		
		WebElement quantity5=driver.findElement(By.xpath("//span[@class='quantity-stepup']"));
		action.moveToElement(quantity5);
		action.click().build().perform();
		action.click().build().perform();
		action.click().build().perform();
		action.click().build().perform();
		
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
		action.moveToElement(addTocart);
		action.click().build().perform();
		
		

	}


}
