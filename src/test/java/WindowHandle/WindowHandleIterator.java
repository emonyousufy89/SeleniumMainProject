package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleIterator {
	
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("the parent window title" + driver.getTitle());
		
		
		driver.findElement(By.xpath("//a//button[contains(text(),'click')]")).click();
		Thread.sleep(2000);
		
		Set <String> str=driver.getWindowHandles();  // set collection for window handling
		
		Iterator<String> move = str.iterator();
		String parent = move.next();
		String child = move.next();
		driver.switchTo().window(child);

		System.out.println("the child window title" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		System.out.println(" 2nd the parent window title" + driver.getTitle());
}
}
