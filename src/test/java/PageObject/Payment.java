package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class Payment extends AbstractPage{

	public Payment(WebDriver driver) {
		super(driver);
	}
	
	public Payment payByBankWire() {
		driver.findElement(By.className("bankwire")).click();
		return new  Payment(driver);
	}
	
	public Payment clickConfirmMyOrder() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		return new  Payment(driver);
	}
	
	public Payment isOrderConfirmationPage() {
		Assert.assertEquals("ORDER CONFIRMATION", driver.findElement(By.className("page-heading")).getText());
		return new Payment(driver);
	}
	

}
