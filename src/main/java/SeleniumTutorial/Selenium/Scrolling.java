package SeleniumTutorial.Selenium;
//package TheMainProject.MainProject;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Scrolling {
//	public static void main(String[] args) throws InterruptedException {
//		
//System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
//		
//		WebDriver driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.navigate().to("https://www.usps.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		
//		jse.executeScript("window.scrollTo(0,2500)");
//		
//		/*WebElement slidRight= driver.findElement(By.xpath("//kkjkjkj")); //to scroll horizontly scrollbar
//		slidRight.sendKeys(Keys.END);*/
//	}
//
//}
