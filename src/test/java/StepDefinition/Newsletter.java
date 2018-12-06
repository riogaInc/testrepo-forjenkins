package StepDefinition;

import PageObject.HalamanUtama;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Newsletter {
	HalamanUtama halamanUtama;
	
	@Given("^User mengisi field isian email \"([^\"]*)\" untuk newsletter dan mengklik tanda > pada Halaman Utama$")
	public void user_mengisi_field_isian_email_untuk_newsletter_dan_mengklik_tanda_pada_Halaman_Utama(String email) throws Throwable {
		halamanUtama = halamanUtama.setEmailNewsletter(email).submitNewsletter();
	}

	@Then("^Field isian email seharusnya tidak berisi notifikasi$")
	public void field_isian_email_seharusnya_tidak_berisi_notifikasi() throws Throwable {
		halamanUtama = halamanUtama.checkEmailFieldNotFillWithNotif();
	}
}
