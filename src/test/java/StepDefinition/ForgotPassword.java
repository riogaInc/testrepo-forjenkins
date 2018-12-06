package StepDefinition;

import PageObject.Authentication;
import PageObject.ForgotPasswordPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ForgotPassword {
	Authentication authentication;
	ForgotPasswordPage forgotPasswordPage;
	
	@Given("^User mengklik link Forgot Your Password\\? pada Halaman Authentication$")
	public void user_mengklik_link_Forgot_Your_Password_pada_Halaman_Authentication() throws Throwable {
		forgotPasswordPage = authentication.navigateToForgotPass();
	}

	@Given("^User mengisi field email address  \"([^\"]*)\" pada Halaman Forgot your password$")
	public void user_mengisi_field_email_address_pada_Halaman_Forgot_your_password(String email) throws Throwable {
		forgotPasswordPage = forgotPasswordPage.setEmail(email);
	}

	@Given("^User mengklik tombol Retrieve Password  pada Halaman Forgot your password$")
	public void user_mengklik_tombol_Retrieve_Password_pada_Halaman_Forgot_your_password() throws Throwable {
		forgotPasswordPage = forgotPasswordPage.clickRetrievePass();
	}

	@Then("^Muncul notifikasi bahwa email konfirmasi sudah terkirim ke alamat email yang di inputkan user$")
	public void muncul_notifikasi_bahwa_email_konfirmasi_sudah_terkirim_ke_alamat_email_yang_di_inputkan_user() throws Throwable {
		forgotPasswordPage = forgotPasswordPage.isSuccessNotifShow();
	}

}
