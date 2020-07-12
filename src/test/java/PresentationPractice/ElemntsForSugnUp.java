package PresentationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemntsForSugnUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement SignIn= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		SignIn.click();
		
		WebElement CreateAccount= driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon account')]"));
		CreateAccount.click();
		
		WebElement CustomerName= driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		CustomerName.sendKeys("Kazi Nadia");
		
		WebElement email= driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("monyl.com");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("ScDown22");
		
		WebElement passwdverify= driver.findElement(By.xpath("//input[@id='ap_password_check']"));
		passwdverify.sendKeys("ScDown22");
		
		WebElement Submit= driver.findElement(By.xpath("//input[@type='submit']"));
		Submit.click();

}


}
