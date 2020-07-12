package SeleniumTutorial.Selenium;
///*package TheMainProject.MainProject;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class HomeWorkTrial {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.navigate().to("https://www.usps.com/");
//		driver.manage().window().maximize();
//		
//		Actions action = new Actions(driver);
//		WebElement mailNship = driver.findElement(By.linkText("Mail & Ship"));
//		action.moveToElement(mailNship);
//		
//		WebElement subMenu = driver.findElement(By.linkText("Stamps & Supplies"));
//		action.moveToElement(subMenu);
//		action.click().build().perform();
//		
//		WebElement cards = driver.findElement(By.partialLinkText("Cards"));
//		action.moveToElement(cards);
//		action.click().build().perform();
//		
//		WebElement greetings = driver.findElement(By.xpath("//li[@class='nav-filter-item']//label[@for='checkbox-type-Product Type-Greeting & Note Cards-27']"));
//		
//		//***** /html/body/div[3]/div[5]/div/div[1]/div[6]/ul/li[2]/p/label
//		action.moveToElement(greetings);
//		action.click().build().perform();
//		
//		//WebElement theme = driver.findElement(By.xpath("//input[@name='checkbox-type-Theme-Commemorative']")); 1
//		// //li[@class='nav-filter-item']//p[@class='checkbox-container']//label[@for='checkbox-type-Theme-Commemorative'2
//		//   //input[@name='checkbox-type-Theme-Commemorative-8']3
//		////li[@class='nav-filter-item']//p[@class='checkbox-container']//label[@for='checkbox-type-Theme-Commemorative'] 4
//		//p[@class='checkbox-container']//label[@for='checkbox-type-Theme-Commemorative']5
//		//input[@id='checkbox-type-Theme-Commemorative']6
//		////li[@class='nav-filter-item']//label[@for='checkbox-type-Theme-Commemorative-8'7
//		//WebElement theme=driver.findElement(By.partialLinkText("Commemorative"));8
//		//*****/html/body/div[3]/div[5]/div/div[1]/div[7]/ul/li[2]/p/label
//		
//		WebElement theme=driver.findElement(By.xpath("//input[@id='checkbox-type-Theme-Commemorative-6']"));
//		action.moveToElement(theme);
//		action.click().build().perform();
//		//WebElement year = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div[1]/div[8]/ul/li[2]/p/label"));
//		//WebElement year = driver.findElement(By.linkText("2018 (5)"));
//		
//		WebElement year = driver.findElement(By.xpath("//input[@name='checkbox-type-Issue Year-2018-5']"));
//		action.moveToElement(year);
//		action.click().build().perform();
//		
//		//WebElement quantity = driver.findElement(By.linkText("1 through 10 (2)"));
//		/*/    //p[@class='checkbox-container']//label[@for='checkbox-type-Quantity-1 through 10']
//		///html/body/div[3]/div[5]/div/div[1]/div[10]/ul/li[2]/p/label
//		///html/body/div[3]/div[5]/div/div[1]/div[10]/ul/li[2]/p/label
//		action.moveToElement(quantity);
//		action.click().build().perform();
//		WebElement red = driver.findElement(By.linkText("/html/body/div[3]/div[5]/div/div[1]/div[11]/div[5]/div"));
//		///html/body/div[3]/div[5]/div/div[1]/div[10]/div[2]/span/div[1]
//		action.moveToElement(red);
//		action.click().build().perform();*/
//		
//		
//		
//		
//		//driver.quit();
//	}
//
//
//}*/