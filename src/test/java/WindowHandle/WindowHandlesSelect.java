package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesSelect {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
