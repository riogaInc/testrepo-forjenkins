	package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount extends AbstractPage{

	public MyAccount(WebDriver driver) {
		super(driver);
	}
	
	public MyAccount isInMyAccount() {
		Assert.assertEquals( "My account", driver.findElement(By.className("navigation_page")).getText());
		return new MyAccount(driver);
	}
	
	public static ContactUsPage navigateToContactus() {
		driver.findElement(By.linkText("Contact us")).click();
		return new ContactUsPage(driver);
	}
	
	public static HalamanUtama navigateToHome() {
		driver.findElement(By.className("home")).click();
		return new HalamanUtama(driver);
	}
	
	public static MyWishlistPage navigateToMyWishlist() {
		driver.findElement(By.className("lnk_wishlist")).click();
		return new MyWishlistPage(driver);
	}
	
	public static OrderHistoryPage navigateToOrderHistoryAndDetail() {
		driver.findElement(By.xpath("//span[contains(text(), 'Order history and details')]")).click();
		return new OrderHistoryPage(driver);
	}
}
