package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tshirt extends AbstractPage{

	public Tshirt(WebDriver driver) {
		super(driver);
	}
	
	public DetailProduct navigateToDetailProduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions actions = new Actions(driver);
		WebElement dp = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li"));
		actions.moveToElement(dp).build().perform();
		driver.findElement(By.linkText("More")).click();
		return new DetailProduct(driver);
	}

}
