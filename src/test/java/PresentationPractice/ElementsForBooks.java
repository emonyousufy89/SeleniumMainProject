package PresentationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementsForBooks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement SearchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("books for toddlers");

		WebElement SearchIcon = driver.findElement(By.xpath("//input[@tabindex='20']"));
		action.moveToElement(SearchIcon);
		action.click().build().perform();
		
		System.out.println("The title of the page is :" + driver.getTitle());

		WebElement SortTheSeacrh = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	
		//SortTheSeacrh.click(); 
				//span[@class='a-button-text a-declarative']
				
		Select s=new Select(SortTheSeacrh);
		s.selectByIndex(2);
		
		/*action.moveToElement(SortTheSeacrh);
		action.click().build().perform();
		Thread.sleep(2000);

		WebElement HighToLow = driver.findElement(By.xpath("//a[contains(text(),'Price: High to Low')]"));
		action.moveToElement(HighToLow);
		action.click().build().perform();
		Thread.sleep(2000);*/

		WebElement prime = driver.findElement(By.xpath("//i[@aria-label='Prime Eligible']"));
		action.moveToElement(prime);
		action.click().build().perform();

		
		//span[contains(text(),'Picture Books')]
		//li[@id='p_n_feature_eight_browse-bin/3269847011']
		//Picture Books
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement pictureBook = driver.findElement(By.linkText("Picture Books"));
		js.executeScript("arguments[0].scrollIntoView();", pictureBook);
		Thread.sleep(2000);
		pictureBook.click();


		WebElement FirstReader = driver.findElement(By.xpath("//span[contains(text(),'My First Reader')]"));
		js.executeScript("arguments[0].scrollIntoView();", FirstReader);
		Thread.sleep(2000);
		FirstReader.click();


		WebElement selectBook = driver.findElement(By.partialLinkText("Polar Bear, Polar Bear, What Do You Hear?"));
		action.moveToElement(selectBook);
		action.click().build().perform();
		
		System.out.println("the title is :" + driver.getTitle());

		WebElement selectQuantity = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		selectQuantity.click();
		
		WebElement selectQuantityfive = driver.findElement(By.xpath("//a[@id='quantity_4']"));
		selectQuantityfive.click();


		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		action.moveToElement(addtocart);
		action.click().build().perform();

		WebElement TotalPrice = driver.findElement(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold']"));
		System.out.println("The total price is :" + TotalPrice.getText());




		/*
		WebElement Year = driver.findElement(By.xpath("//input[@name='s-ref-checkbox-21103541011']")); 
		js.executeScript("arguments[0].scrollIntoView();", Year);
		Thread.sleep(2000);
		Year.click();
		Thread.sleep(2000);
		//span[contains(text(),'My First Reader')]
		//select[@name='quantity']
		 * //select[@name='quantity']
		 * 
		 //span[@id='a-autoid-0-announce']//span
		WebElement Brand = driver.findElement(By.linkText("SAMSUNG"));
		js.executeScript("arguments[0].scrollIntoView();", Brand);
		Thread.sleep(2000);
		Brand.click();
		Thread.sleep(2000);*/







	}
}
