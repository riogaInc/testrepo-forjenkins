package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HalamanUtama extends AbstractPage{

	public HalamanUtama(WebDriver driver) {
		super(driver);
	}
	
	public static Authentication navigateToSignIn() {
		driver.findElement(By.linkText("Sign in")).click();
		return new Authentication(driver);
	}
	
	public static ContactUsPage navigateToContactus() {
		driver.findElement(By.linkText("Contact us")).click();
		return new ContactUsPage(driver);
	}

	public static Tshirt navigateToWomenTShirt() {
		Actions actions = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]"));
		actions.moveToElement(women).build().perform();
		driver.findElement(By.linkText("T-shirts")).click();
		return new Tshirt(driver);
	}
	
	public static HalamanUtama setEmailNewsletter(String email) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("newsletter-input")).sendKeys(email);
		return new HalamanUtama(driver);
	}
	
	public HalamanUtama submitNewsletter() {
		driver.findElement(By.name("submitNewsletter")).click();
		return new HalamanUtama(driver);
	}
	
	public HalamanUtama checkEmailFieldNotFillWithNotif() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Assert.assertEquals("Enter your e-mail",driver.findElement(By.id("newsletter-input")).getAttribute("value"));
		return new HalamanUtama(driver);
	}
}
