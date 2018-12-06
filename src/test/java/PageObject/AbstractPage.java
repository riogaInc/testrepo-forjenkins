package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPage {
	protected static WebDriver driver;
	protected static String geckoPath = System.getProperty("user.dir")+"\\lib\\geckodriver.exe";
	
	public AbstractPage(WebDriver driver) {
		AbstractPage.driver = driver;
	}
	
	private static void setWebDriverFirefox(String urlAdd) {
		System.setProperty("webdriver.gecko.driver", geckoPath);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get(urlAdd);
	}
	
	public static HalamanUtama navigateToHalamanUtama(String urlAdd) throws InterruptedException {
		System.out.println(driver);
		if(driver==null) {setWebDriverFirefox(urlAdd);}
		return new HalamanUtama(driver);
	}
	
	public static void closeBrowser() {
		driver.close();
	    driver = null;
	}
	
	public static void isCartNotEmpty() {
		Assert.assertNotEquals("(empty)", driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")).getText());
	}
	
}
