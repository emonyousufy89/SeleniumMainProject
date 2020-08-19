package PopUpANDI_FRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWithTextBox {

	public static WebDriver driver;
	
	static String ExpectText = "Hello Emon Yousufy How are you today";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		
		// https://opensource-demo.orangehrmlive.com/
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Emon Yousufy");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		String actualText = driver.findElement(By.xpath("//p[contains(text(),'Hello Emon Yousufy How are you today')]")).getText();

		if(ExpectText.equals(actualText)== true)
		{
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
		driver.quit();

	}

}
