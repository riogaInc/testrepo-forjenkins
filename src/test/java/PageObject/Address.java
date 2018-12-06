package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Address extends AbstractPage{

	public Address(WebDriver driver) {
		super(driver);
	}
	
	public Address setDeliveryAdd(String add) {
		Select address = new Select(driver.findElement(By.id("id_address_delivery")));
		address.selectByVisibleText(add);
		return new Address(driver);
	}
	
	public Address checkDeliverySameWithBillAdd()  {
		if(!driver.findElement(By.name("same")).isSelected()) {
			driver.findElement(By.name("same")).click();
		}
		return new Address(driver);
	}
	
	public Shipping navigateToShipping() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.name("processAddress")).click();
		return new Shipping(driver);
	}

}
