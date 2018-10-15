package StepDefinition;

import PageObject.MainPage;
import PageObject.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	MainPage mainPage;
	SignInPage signInPage;
	
	@Given("^User berada di Main Page \"([^\"]*)\"$")
	public void user_berada_di_Main_Page(String urlAdd) throws Throwable {
		mainPage=MainPage.navigateToMainPage(urlAdd);
	}

	@Given("^User melakukan hover pada menu Account&Lists di Main Page$")
	public void user_melakukan_hover_pada_menu_Account_Lists_di_Main_Page() throws Throwable {
		mainPage=mainPage.hoverOnAccountLists();
	}

	@Given("^User mengklik tombol Sign In pada menu Account&Lists di Main Page$")
	public void user_mengklik_tombol_Sign_In_pada_menu_Account_Lists_di_Main_Page() throws Throwable {
		signInPage=mainPage.clickSignInButtonAccountLists();
	}

	@Given("^User berada pada Sign In Page$")
	public void user_berada_pada_Sign_In_Page() throws Throwable {
		signInPage=signInPage.validateSignInPage();
	}

	@Given("^User mengisi email pada textbox Email \"([^\"]*)\" pada Sign In Page$")
	public void user_mengisi_email_pada_textbox_Email_pada_Sign_In_Page(String email) throws Throwable {
		signInPage=signInPage.setEmail(email);
	}

	@Given("^User mengklik tombol Continue pada Sign In Page$")
	public void user_mengklik_tombol_Continue_pada_Sign_In_Page() throws Throwable {
		signInPage=signInPage.clickContinue();
	}

	@Given("^User mengisi email pada textbox Password \"([^\"]*)\" pada Sign In Page$")
	public void user_mengisi_email_pada_textbox_Password_pada_Sign_In_Page(String password) throws Throwable {
		signInPage=signInPage.setPassword(password);
	}

	@Given("^User mengklik tombol Sign In pada Sign In Page$")
	public void user_mengklik_tombol_Sign_In_pada_Sign_In_Page() throws Throwable {
		mainPage=signInPage.clickSignIn();
	}

	@Then("^Nama user \"([^\"]*)\" muncul pada menu Account&Lists di Main Page$")
	public void nama_user_muncul_pada_menu_Account_Lists_di_Main_Page(String name) throws Throwable {
		mainPage=mainPage.validateUserInMainPage(name);
	}


}
