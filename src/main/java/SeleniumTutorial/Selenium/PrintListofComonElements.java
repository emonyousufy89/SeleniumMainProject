package SeleniumTutorial.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintListofComonElements {
	//https://www.amazon.com/
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		List <WebElement> listofAllLinks1 = driver.findElements(By.tagName("a"));
		int noOflinkss=listofAllLinks1.size();
		
		//int noOflinkss = driver.findElements(By.tagName("a")).size();
		
		System.out.println("No of list of anchor links on my home page " + noOflinkss);
		
		driver.quit();

}
}