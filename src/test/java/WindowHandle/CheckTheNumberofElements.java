package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckTheNumberofElements {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement we= driver.findElement(By.id("Skills"));

		Select t = new Select(we);
		t.selectByIndex(6);
		
		System.out.println(t.getOptions().size());
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Male']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isEnabled());
		
		WebElement wee= driver.findElement(By.xpath("//select[@id='countries']"));

		Select s = new Select(wee);
		s.selectByVisibleText("Bangladesh");
		
		driver.quit();
	}

}
