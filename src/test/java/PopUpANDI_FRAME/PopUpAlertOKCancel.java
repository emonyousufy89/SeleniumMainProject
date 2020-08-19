package PopUpANDI_FRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertOKCancel {

	public static WebDriver driver;

	static String ExpectText = "You pressed Ok";
	static String ExpectTexttwo = "You Pressed Cancel";


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		String actualText = driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]")).getText();

		if(ExpectText.equals(actualText)== true)
		{
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}

		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();;
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		String actualTxt = driver.findElement(By.xpath("//p[contains(text(),'You Pressed Cancel')]")).getText();

		if(ExpectTexttwo.equals(actualTxt)==true) {
			System.out.println("Test is pass again");
		}
		else {
			System.out.println("test is failed again");
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
