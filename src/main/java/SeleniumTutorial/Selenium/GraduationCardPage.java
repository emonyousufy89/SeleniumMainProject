package SeleniumTutorial.Selenium;
//package TheMainProject.MainProject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.common.base.Preconditions;
//
//import Com.talentech.Stepdefination.Hooks;
//
//public class GraduationCardPage {
//
//	//public WebDriver driver;
//	public GraduationCardPage() {
//		PageFactory.initElements(Hooks.driver, this);
//	
//	}
////	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Search or Track Packages')]")
////	WebElement Text;
////	public void Show() {
////	System.out.println(Text.getText());
////	}
////	
////	@FindBy(how=How.LINK_TEXT,using="Mail & Ship")
////	WebElement mailNship;
////	public void MailShip(){
////		Actions action = new Actions(driver);
////		action.moveToElement(mailNship);
////	}
//	
//	@FindBy(how=How.XPATH,using="//h3//a[contains(text(),'Stamps & Supplies')]")
//	WebElement Stamps;
//	public void Stamp() {
//		Stamps.click();
//		
//	}
//	@FindBy(how=How.XPATH,using="//li//img[@src='https://www.usps.com/store/images/ps-subicon-cards.png']")
//	WebElement CardNenv;
//	public void CardEnv() {
//		CardNenv.click();
//	}
//	@FindBy(how=How.XPATH,using="//label[contains(text(),'Graduation (4)')]")
//	
//	WebElement grad;
//	public void Graduation() {
//		JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;
//		js.executeScript("arguments[0].scrollIntoView();", grad);
//		
////		WebDriverWait wait = new WebDriverWait(Hooks.driver, 10);
////		WebElement element = wait.until(
////		ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Graduation (4)')]")));
//		grad.click();
//	}
//	@FindBy(how=How.XPATH,using="//div[contains(text(),'Flowers From the Garden Notecards')]")
//	WebElement FlowersCard;
//	public void Flowers() {
//		JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;
//		js.executeScript("arguments[0].scrollIntoView();", FlowersCard);
//	FlowersCard.click();
//	}
//	@FindBy(how=How.XPATH,using="//a[@class='button--primary button--green button--cart add-to-cart']")
//	WebElement addTocart;
//	public void addCart() throws InterruptedException {
//		JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;
//		js.executeScript("arguments[0].scrollIntoView();", addTocart);
//	addTocart.click();
//	Thread.sleep(3000);
//	}
//	@FindBy(how=How.XPATH,using="//a[contains(text(),'Check Out Now')]")
//	WebElement checkout;
//	public void ChekOut() {
//	checkout.click();
//	}
//	
//
//
//}
