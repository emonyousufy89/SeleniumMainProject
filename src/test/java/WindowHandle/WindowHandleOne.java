package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandleOne {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
	   
	
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a//button[contains(text(),'click')]")).click();
		Thread.sleep(2000);
		
		Set <String> str=driver.getWindowHandles();  // set collection for window handling
		
		for(String i : str) {
			System.out.println(i); // print the id number of both windows like : CDwindow-B35E31ABB389A2A6AE6555FF0070B348
			String s=driver.switchTo().window(i).getTitle(); // get the title of both window
			System.out.println(s); //printing the title of both window
		}
		
		
		
	}

}
