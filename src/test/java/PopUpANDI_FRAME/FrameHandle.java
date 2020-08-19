package PopUpANDI_FRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fram = driver.findElement(By.cssSelector("iframe[id=singleframe]"));
		driver.switchTo().frame(fram);
		driver.findElement(By.xpath("//div[@class='row']//input[@type='text']")).sendKeys("emon");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		driver.findElement(By.xpath("//div[@class='row']//input[@type='text']")).sendKeys("iframe into iframe");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
