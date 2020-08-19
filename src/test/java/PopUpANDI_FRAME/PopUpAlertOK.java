package PopUpANDI_FRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertOK {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Alert with OK")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
