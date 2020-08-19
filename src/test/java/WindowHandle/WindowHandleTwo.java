package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTwo {

	public static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a//button[contains(text(),'click')]")).click();

		Set <String> str=driver.getWindowHandles();

		for (String i:str) {
			String t = driver.switchTo().window(i).getTitle();
			//			if (t.contains("sakinalium.in")) {    /// closing child window
			//				driver.close();
			//			}
			if(t.contains("Frames & windows")) {  // closing parent window
				driver.close();
			}
		}

		driver.quit();
	}

}
