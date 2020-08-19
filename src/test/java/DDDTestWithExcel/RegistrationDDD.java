package DDDTestWithExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







//input[@value='Male']
//input[@value='Cricket']



public class RegistrationDDD {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		FileInputStream file = new FileInputStream("/Users/mdsalahuddin/Documents/Player.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		//XSSFSheet sheet1 = book.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("the number of rows " + rowcount);
		
		for (int i=1; i<rowcount; i++) {
			XSSFRow RowRead = sheet.getRow(i);
			
			String fisrtName = RowRead.getCell(0).getStringCellValue();
			String lastName = RowRead.getCell(1).getStringCellValue();
			String address = RowRead.getCell(2).getStringCellValue();
			String email = RowRead.getCell(3).toString();
			String phone = RowRead.getCell(4).toString();
			String firstPass = RowRead.getCell(5).getStringCellValue();
			String SEcondPass = RowRead.getCell(6).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fisrtName );
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
			
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			driver.findElement(By.xpath("//input[@value='Cricket']")).click();
			
			Select select = new Select(driver.findElement(By.linkText("Languages")));
			select.selectByVisibleText("English");
			Select select2 = new Select(driver.findElement(By.linkText("Skills")));
			select2.selectByVisibleText("C");
			Select select3 = new Select(driver.findElement(By.linkText("Country*")));
			select3.selectByVisibleText("United States");
			Select select4 = new Select(driver.findElement(By.linkText("Select Country :")));
			select4.selectByVisibleText("United States of America");
			Select select5 = new Select(driver.findElement(By.linkText("year")));
			select5.selectByVisibleText("1920");
			Select select6 = new Select(driver.findElement(By.linkText("Month")));
			select6.selectByVisibleText("May");
			Select select7 = new Select(driver.findElement(By.linkText("Day")));
			select7.selectByVisibleText("8");
			
			driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(firstPass);
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(SEcondPass);
			
			
		}
		
	}

}
