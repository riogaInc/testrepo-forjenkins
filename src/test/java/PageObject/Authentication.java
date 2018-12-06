package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Authentication extends AbstractPage{

	public Authentication(WebDriver driver) {
		super(driver);
	}
	
	public Authentication setEmailForSignIn(String email) {
		driver.findElement(By.id("email")).sendKeys(email);;
		return new Authentication(driver);
	}
	
	public Authentication setPassForSignIn(String pass) {
		driver.findElement(By.id("passwd")).sendKeys(pass);;
		return new Authentication(driver);
	}
	
	public MyAccount clickSignInButton() {
		driver.findElement(By.id("SubmitLogin")).click();
		return new MyAccount(driver);
	}
	
	public Authentication isLoginErrorEmail() {
		Assert.assertEquals("Invalid email address.",driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText());
		return new Authentication(driver);
	}
	
	public Authentication isLoginErrorPass() {
		Assert.assertEquals("Invalid password.",driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText());
		return new Authentication(driver);
	}
	
	public static Authentication setEmailRegister(String email) {
		driver.findElement(By.id("email_create")).sendKeys(email);
		return new Authentication(driver);
	}
	
	public Authentication clickCreateAnAccountButton() {
		driver.findElement(By.id("SubmitCreate")).click();
		return new Authentication(driver);
	}
	
	public Authentication setTitle(String title) {
		if(title.equalsIgnoreCase("mrs.")) {
			driver.findElement(By.id("id_gender2")).click();
		}else if (title.equalsIgnoreCase("mr.")){
			driver.findElement(By.id("id_gender1")).click();
		}
		return new Authentication(driver);
	}
	
	public Authentication setFirstname(String fn) {
		driver.findElement(By.id("customer_firstname")).sendKeys(fn);
		return new Authentication(driver);
	}
	
	public Authentication setLastname(String ln) {
		driver.findElement(By.id("customer_lastname")).sendKeys(ln);
		return new Authentication(driver);
	}
	
	public Authentication setEmail(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		return new Authentication(driver);
	}
	
	public Authentication setDateDOB(String dDOB) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Select dateDOB = new Select(driver.findElement(By.id("days")));
		dateDOB.selectByValue(dDOB);
		return new Authentication(driver);
	}
	
	public Authentication setMonthDOB(String mDOB) {
		Select monthDOB = new Select(driver.findElement(By.id("months")));
		monthDOB.selectByValue(mDOB);
		return new Authentication(driver);
	}
	
	public Authentication setYearDOB(String yDOB) {
		Select yearDOB = new Select(driver.findElement(By.id("years")));
		yearDOB.selectByValue(yDOB);
		return new Authentication(driver);
	}
	
	public Authentication setPassword(String pass) {
		driver.findElement(By.id("passwd")).sendKeys(pass);
		return new Authentication(driver);
	}
	
	public Authentication setCompany(String comp) {
		driver.findElement(By.id("company")).sendKeys(comp);
		return new Authentication(driver);
	}
	
	public Authentication setAddress(String address) {
		driver.findElement(By.id("address1")).sendKeys(address);
		return new Authentication(driver);
	}
	
	public Authentication setCity(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
		return new Authentication(driver);
	}
	
	public Authentication setState(String s) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText(s);
		return new Authentication(driver);
	}
	
	public Authentication setZip(String zip) {
		driver.findElement(By.id("postcode")).sendKeys(zip);
		return new Authentication(driver);
	}
	
	public Authentication setCountry(String c) {
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText(c);
		return new Authentication(driver);
	}
	
	public Authentication setPhone(String phone) {
		driver.findElement(By.id("phone")).sendKeys(phone);
		return new Authentication(driver);
	}
	
	public Authentication setHP(String hp) {
		driver.findElement(By.id("phone_mobile")).sendKeys(hp);
		return new Authentication(driver);
	}
	
	public Authentication setAddressAlias(String alias) {
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys(alias);
		return new Authentication(driver);
	}
	
	public MyAccount clickRegister() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("submitAccount")).click();
		return new MyAccount(driver);
	}
	
	public Authentication isNotifErrorExist() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div")).isDisplayed();
		return new Authentication(driver);
	}
	
	public Authentication isEmailAlreadyRegistered() {
		Assert.assertEquals( "An account using this email address has already been registered.", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/ol/li")).getText());
		return new Authentication(driver);
	}
	
	public Authentication isEmailAlreadyRegisteredAwal() {
		driver.findElement(By.id("create_account_error")).isDisplayed();
		return new Authentication(driver);
	}
	
	public Authentication isMsgInErrorNotifWrong(String msg) {
		String message =  driver.findElement(By.xpath("//div[@id='create_account_error']/ol/li")).getText();
		Assert.assertNotEquals(msg, message);
		return new Authentication(driver);
	}
	
	public Authentication isMsgInErrorNotifWrongInputData(String msg) {
		String message =  driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertNotEquals(msg, message.replace("\n", " ").replace("\r", " "));
		return new Authentication(driver);
	}
	
	public static ForgotPasswordPage navigateToForgotPass() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		return new ForgotPasswordPage(driver);
	}

}
