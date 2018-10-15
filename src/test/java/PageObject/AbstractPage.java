package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPage {
	protected static WebDriver driver;
	protected static String geckoPath = "C:\\\\Users\\satrio.wijaya\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe";
	
	public AbstractPage(WebDriver driver) {
		AbstractPage.driver = driver;
	}
	
	private static void setWebDriverFirefox(String urlAdd) {
		System.setProperty("webdriver.gecko.driver", geckoPath);
		driver = new FirefoxDriver();
		driver.get(urlAdd);
	}
	
	public static MainPage navigateToMainPage(String urlAdd) {
		if(driver==null) {setWebDriverFirefox(urlAdd);}
		return new MainPage(driver);
	}
	
}
