package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.junit.Assert;

public class MainPage extends AbstractPage {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public MainPage hoverOnAccountLists() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement menuAccountLists = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(menuAccountLists).build().perform();
		Thread.sleep(2000);
		return new MainPage(driver);
	}
	
	public SignInPage clickSignInButtonAccountLists() {
		driver.findElement(By.linkText("Sign in")).click();
		return new SignInPage(driver);
	}
	
	public MainPage validateUserInMainPage(String name) {
		Assert.assertEquals("Nama User berbeda", "Hello, "+name, driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")).getText());
		return new MainPage(driver);
	}

}
