package PresentationPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsForSignIn {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement SignIn= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		SignIn.click();
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("ScreenShots/signIn.jpg"));
		
		WebElement email= driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("emonyousufy89@gmail.com");
		
		
		WebElement Continue= driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		
		WebElement password= driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("ScrollDown22");
		
		WebElement submit= driver.findElement(By.xpath("//input[@id= 'signInSubmit']"));
		submit.click();
		Thread.sleep(2000);
		
		System.out.println("The title is :" + driver.getTitle());

}

}
