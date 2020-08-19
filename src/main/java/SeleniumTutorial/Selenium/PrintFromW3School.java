package SeleniumTutorial.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.core.ParseException;

public class PrintFromW3School {
	
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
		 wd= new ChromeDriver();
		 wd.get("https://www.w3schools.com/html/html_tables.asp"); 
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 String baseTable = wd.findElement(By.cssSelector("table[id=customers]")).getText();
		 
		 //Object [][] obj = new Object[4][5];
		 
		 
		 
		  
		 System.out.print(baseTable + "  ");
		 System.out.println();
		 
	}

}
