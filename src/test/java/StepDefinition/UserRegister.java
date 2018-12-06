package StepDefinition;

import PageObject.Authentication;
import PageObject.HalamanUtama;
import PageObject.MyAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRegister {
	HalamanUtama halamanUtama;
	Authentication authentication;
	MyAccount myAccount;
	
	@Given("^User mengisi email \"([^\"]*)\" pada form create an account pada Halaman Authentication$")
	public void user_mengisi_email_pada_form_create_an_account_pada_Halaman_Authentication(String email) throws Throwable {
		authentication = Authentication.setEmailRegister(email);
	}

	@Given("^User mengklik tombol Create An Account pada Halaman Authentication$")
	public void user_mengklik_tombol_Create_An_Account_pada_Halaman_Authentication() throws Throwable {
		authentication = authentication.clickCreateAnAccountButton();
	}

	@Given("^User mengklik tombol Register pada Halaman Authentication$")
	public void user_mengklik_tombol_Register_pada_Halaman_Authentication() throws Throwable {
		myAccount = authentication.clickRegister();
	}

	@Then("^Muncul notifikasi bahwa field isian mandatory belum terisi pada Halaman Authentication$")
	public void muncul_notifikasi_bahwa_field_isian_mandatory_belum_terisi_pada_Halaman_Authentication() throws Throwable {
		authentication = authentication.isNotifErrorExist();
	}

	@Then("^Muncul notifikasi bahwa email sudah terdaftar pada Halaman Authentication$")
	public void muncul_notifikasi_bahwa_email_sudah_terdaftar_pada_Halaman_Authentication() throws Throwable {
		authentication = authentication.isEmailAlreadyRegistered();
	}

	@Given("^User mengisi data personal information dan data address pada Halaman Authentication \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_mengisi_data_personal_information_dan_data_address_pada_Halaman_Authentication(String title, String firstname, String lastname, String email, String password, String dayDOB, String monthDOB, String yearDOB, String company, String address, String city, String state, String zip, String country, String phone, String hp, String addAlias) throws Throwable {
		authentication = authentication.setTitle(title).setFirstname(firstname).setLastname(lastname).setEmail(email).setPassword(password).setDateDOB(dayDOB).setMonthDOB(monthDOB).setYearDOB(yearDOB).setCompany(company).setAddress(address).setCity(city).setState(state).setZip(zip).setCountry(country).setPhone(phone).setHP(hp).setAddressAlias(addAlias);
	}
	
	@Then("^Muncul notifikasi bahwa email sudah terdaftar pada Halaman Authentication Awal$")
	public void muncul_notifikasi_bahwa_email_sudah_terdaftar_pada_Halaman_Authentication_Awal() throws Throwable {
		authentication = authentication.isEmailAlreadyRegisteredAwal();
	}
	
	@Then("^Terjadi kesalahan pada pesan notifikasi error \"([^\"]*)\" pada Halaman Authentication$")
	public void terjadi_kesalahan_pada_pesan_notifikasi_error_pada_Halaman_Authentication(String msg) throws Throwable {
		authentication = authentication.isMsgInErrorNotifWrong(msg);
	}
	
	@Then("^Then Pesan notifikasi error yang berhubungan dengan algoritma system \"([^\"]*)\"$")
	public void then_Pesan_notifikasi_error_yang_berhubungan_dengan_algoritma_system(String msg) throws Throwable {
		authentication = authentication.isMsgInErrorNotifWrongInputData(msg);
	}
}
