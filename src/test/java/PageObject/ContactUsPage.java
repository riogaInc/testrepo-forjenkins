package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends AbstractPage{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	public ContactUsPage setSubjctHeading(String sh) {
		Select SubHead = new Select(driver.findElement(By.id("id_contact")));
		SubHead.selectByVisibleText(sh);
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage setEmail(String email) {
		if(!email.equals("")) {
			driver.findElement(By.id("email")).sendKeys(email);
		}
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage setOrderRef(String or) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("id_order")).sendKeys(or);
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage setMsg(String msg) {
		driver.findElement(By.id("message")).sendKeys(msg);
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage clickSend() {
		driver.findElement(By.id("submitMessage")).click();
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage isContactUsMsgSuccess() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p")).isDisplayed();
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage isContactUsMsgError() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div")).isDisplayed();
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage setOrderRefLogin(String or) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Select SubHead = new Select(driver.findElement(By.name("id_order")));
		SubHead.selectByValue(or);;
		return new ContactUsPage(driver);
	}
	
	public ContactUsPage setProductLogin(String prod) {
		Select SubHead = new Select(driver.findElement(By.name("id_product")));
		SubHead.selectByValue(prod);;
		return new ContactUsPage(driver);
	}

}
