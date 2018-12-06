package StepDefinition;

import PageObject.AbstractPage;
import PageObject.Authentication;
import PageObject.HalamanUtama;
import PageObject.MyAccount;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserLogin {
	HalamanUtama halamanUtama;
	Authentication authentication;
	MyAccount myAccount;
	
	@Given("^User berada di Main Page \"([^\"]*)\"$")
	public void user_berada_di_Main_Page(String url) throws Throwable {
		halamanUtama = AbstractPage.navigateToHalamanUtama(url);
	}

	@Given("^User mengklik tombol Sign In pada Halaman Utama$")
	public void user_mengklik_tombol_Sign_In_pada_Halaman_Utama() throws Throwable {
		authentication = HalamanUtama.navigateToSignIn();
	}

	@Given("^User mengisi email \"([^\"]*)\" dan password \"([^\"]*)\" pada form sign pada Halaman Authentication$")
	public void user_mengisi_email_dan_password_pada_form_sign_pada_Halaman_Authentication(String email, String pass) throws Throwable {
		authentication = authentication.setEmailForSignIn(email).setPassForSignIn(pass);
	}

	@Given("^User mengklik tombol Sign In pada Halaman Authentication$")
	public void user_mengklik_tombol_Sign_In_pada_Halaman_Authentication() throws Throwable {
		myAccount = authentication.clickSignInButton();
	}

	@Then("^User berhasil sign in dan berada pada Halaman My Account$")
	public void user_berhasil_sign_in_dan_berada_pada_Halaman_My_Account() throws Throwable {
		myAccount = myAccount.isInMyAccount();
	}

	@Then("^Muncul notifikasi error invalid email address pada Halaman Authentication$")
	public void muncul_notifikasi_error_invalid_email_address_pada_Halaman_Authentication() throws Throwable {
		authentication = authentication.isLoginErrorEmail();
	}

	@Then("^Muncul notifikasi error invalid password pada Halaman Authentication$")
	public void muncul_notifikasi_error_invalid_password_pada_Halaman_Authentication() throws Throwable {
		authentication = authentication.isLoginErrorPass();
	}
	
	@After
	public void close_browser() {
		AbstractPage.closeBrowser();
	}

}
