package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends AbstractPage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public ForgotPasswordPage setEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return new ForgotPasswordPage(driver);
	}
	
	public ForgotPasswordPage clickRetrievePass() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/p/button")).click();
		return new ForgotPasswordPage(driver);
	}
	
	public ForgotPasswordPage isSuccessNotifShow() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p")).isDisplayed();
		return new ForgotPasswordPage(driver);
	}

}
