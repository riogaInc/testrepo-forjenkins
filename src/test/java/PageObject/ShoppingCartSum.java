package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSum extends AbstractPage{

	public ShoppingCartSum(WebDriver driver) {
		super(driver);
	}
	
	public static Address navigateToAddress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("Proceed to checkout")).click();
		return new Address(driver);
	}

}
