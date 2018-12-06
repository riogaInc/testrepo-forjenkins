package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends AbstractPage{

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
	}
	
	public OrderHistoryPage clickOrderHistory(String orderName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while(!driver.findElement(By.linkText(orderName)).isDisplayed()){
			js.executeScript("window.scrollBy(0,50)");
		}
		driver.findElement(By.linkText(orderName)).click();
		return new OrderHistoryPage(driver);
	}
	
	public ShoppingCartSum clickReorder() {
		driver.findElement(By.xpath("//span[contains(text(), 'Reorder')]")).click();
		return new ShoppingCartSum(driver);
	}

}
