package WindowHandle;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapLogInTest {
	
	public static HashMap <String, String> loginmethod()
	{
		
		HashMap <String, String> hm = new HashMap <String, String>();
		
		hm.put("Sam", "mercury1@marcury.com");
		hm.put("Tom", "mercury2@marcury.com");
		hm.put("Kate", "mercury3@marcury.com");
		
		return hm;
		
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://newtours.demaut.com");

	}

}
