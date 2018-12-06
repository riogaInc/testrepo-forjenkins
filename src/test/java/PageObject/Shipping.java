package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Shipping extends AbstractPage{

	public Shipping(WebDriver driver) {
		super(driver);
	}
	
	public Shipping checkTermAgreement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		if(!driver.findElement(By.name("cgv")).isSelected()) {
			driver.findElement(By.name("cgv")).click();
		}
		return new Shipping(driver);
	}
	
	public Payment navigateToPayment() {
		driver.findElement(By.name("processCarrier")).click();
		return new Payment(driver);
	}
	
}
