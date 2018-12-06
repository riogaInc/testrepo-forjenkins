package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class DetailProduct extends AbstractPage{

	public DetailProduct(WebDriver driver) {
		super(driver);
	}
	
	public DetailProduct setQuantity(String q) {
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys(q);;
		return new DetailProduct(driver);
	} 
	
	public DetailProduct setSize(String s) {
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText(s);
		return new DetailProduct(driver);
	}
	
	public DetailProduct setColor(String c) {
		driver.findElement(By.id(c)).click();
		return new DetailProduct(driver);
	} 
	
	public DetailProduct clickAddToCart() {
		driver.findElement(By.name("Submit")).click();
		return new DetailProduct(driver);
	} 
	
	public ShoppingCartSum clickProceedToCheckoutPopUp() {
		driver.findElement(By.linkText("Proceed to checkout")).click();
		return new ShoppingCartSum(driver);
	} 
	
	public DetailProduct clickContinueShoppingPopUp() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();
		return new DetailProduct(driver);
	} 
	
	public static DetailProduct clickAddToWishlist() {
		driver.findElement(By.linkText("Add to wishlist")).click();
		return new DetailProduct(driver);
	}
	
	public DetailProduct isProductAddedToWishlist() {
		Assert.assertEquals("Added to your wishlist.", driver.findElement(By.className("fancybox-error")).getText());
		return new DetailProduct(driver);
	}

}
