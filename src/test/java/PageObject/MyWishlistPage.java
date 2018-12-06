package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyWishlistPage extends AbstractPage{

	public MyWishlistPage(WebDriver driver) {
		super(driver);
	}
	
	public MyWishlistPage setName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage clickSave() {
		driver.findElement(By.id("submitWishlist")).click();
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage isWishListExist(String wl) {
		driver.findElement(By.linkText(wl)).isDisplayed();
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage clickMyWishlistList(String wl) {
		driver.findElement(By.linkText(wl)).click();
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage clickSendThisWishlist() {
		driver.findElement(By.id("showSendWishlist")).click();
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage setEmail1(String email) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("email1")).sendKeys(email);
		return new MyWishlistPage(driver);
	}
	
	public MyWishlistPage clickSend() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.name("submitWishlist")).click();
		return new MyWishlistPage(driver);
	}
}
