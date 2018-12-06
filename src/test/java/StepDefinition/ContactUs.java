package StepDefinition;

import PageObject.ContactUsPage;
import PageObject.HalamanUtama;
import PageObject.MyAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUs {
	HalamanUtama halamanUtama;
	ContactUsPage contactUsPage;
	MyAccount myAccount;

	@Given("^User mengklik tombol Contact Us pada Halaman Utama$")
	public void user_mengklik_tombol_Contact_Us_pada_Halaman_Utama() throws Throwable {
		contactUsPage = halamanUtama.navigateToContactus();
	}

	@Given("^User mengisi form Customer Service - Contact Us pada Halaman Contact \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_mengisi_form_Customer_Service_Contact_Us_pada_Halaman_Contact(String subject, String email, String ref, String msg) throws Throwable {
		contactUsPage = contactUsPage.setSubjctHeading(subject).setEmail(email).setOrderRef(ref).setMsg(msg);
	}

	@Given("^User mengklik tombol Send pada Halaman Contact$")
	public void user_mengklik_tombol_Send_pada_Halaman_Contact() throws Throwable {
		contactUsPage = contactUsPage.clickSend();
	}

	@Then("^Muncul Notifikasi bahwa pesan sukses terkirim pada Halaman Contact$")
	public void muncul_Notifikasi_bahwa_pesan_sukses_terkirim_pada_Halaman_Contact() throws Throwable {
		contactUsPage = contactUsPage.isContactUsMsgSuccess();
	}

	@Given("^User mengklik tombol Contact Us pada My Account$")
	public void user_mengklik_tombol_Contact_Us_pada_My_Account() throws Throwable {
		contactUsPage =  myAccount.navigateToContactus();
	}

	@Then("^Muncul Notifikasi bahwa field isian tidak boleh kosong pada Halaman Contact$")
	public void muncul_Notifikasi_bahwa_field_isian_tidak_boleh_kosong_pada_Halaman_Contact() throws Throwable {
		contactUsPage = contactUsPage.isContactUsMsgError();
	}
	
	@Given("^User mengisi form Customer Service - Contact Us setelah login pada Halaman Contact \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_mengisi_form_Customer_Service_Contact_Us_setelah_login_pada_Halaman_Contact(String sub, String email, String ref, String prod, String msg) throws Throwable {
		contactUsPage = contactUsPage.setSubjctHeading(sub).setEmail(email).setOrderRefLogin(ref).setProductLogin(prod).setMsg(msg);
	}
	
}
