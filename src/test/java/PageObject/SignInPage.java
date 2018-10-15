package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage {

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	public SignInPage validateSignInPage() {
		String pageTitle = driver.findElement(By.className("a-spacing-small")).getText();
		Assert.assertEquals("User tidak berada pada SignIn Page", "Sign in", pageTitle.trim());
		return new SignInPage(driver);
	}
	
	public SignInPage setEmail(String email) {
		driver.findElement(By.id("ap_email")).sendKeys(email);
		return new SignInPage(driver);
	}
	
	public SignInPage clickContinue() {
		driver.findElement(By.id("continue")).click();
		return new SignInPage(driver); 
	}
	
	public SignInPage setPassword(String pass) {
		driver.findElement(By.id("ap_password")).sendKeys(pass);;
		return new SignInPage(driver);
	}
	
	public MainPage clickSignIn() {
		driver.findElement(By.id("signInSubmit")).click();
		return new MainPage(driver);
	}

}
