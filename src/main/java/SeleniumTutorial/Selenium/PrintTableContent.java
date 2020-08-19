package SeleniumTutorial.Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import freemarker.core.ParseException;
public class PrintTableContent {

	    public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
			System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
			 wd= new ChromeDriver();
			 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
			 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 String baseTable = wd.findElement(By.tagName("table")).getText();
			  
			 System.out.print(baseTable + "  ");
			 System.out.println();
			 //To find third row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 3rd row's 2nd column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    wd.close(); 
	    }
	}

