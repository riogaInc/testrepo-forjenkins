package StepDefinition;

import PageObject.DetailProduct;
import PageObject.MyAccount;
import PageObject.MyWishlistPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyWishlist {
	MyAccount myAccount;
	MyWishlistPage myWishlistPage;
	DetailProduct detailProduct;
	
	@Given("^User mengklik tombol My Wishlist pada Halaman My Account$")
	public void user_mengklik_tombol_My_Wishlist_pada_Halaman_My_Account() throws Throwable {
		myWishlistPage = myAccount.navigateToMyWishlist();
	}

	@Given("^User mengisi nama wishlist \"([^\"]*)\" pada Halaman My Wishlist$")
	public void user_mengisi_nama_wishlist_pada_Halaman_My_Wishlist(String name) throws Throwable {
		myWishlistPage = myWishlistPage.setName(name);
	}

	@Given("^User mengklik tombol save pada Halaman My Wishlist$")
	public void user_mengklik_tombol_save_pada_Halaman_My_Wishlist() throws Throwable {
		myWishlistPage = myWishlistPage.clickSave();
	}

	@Then("^Wishlist \"([^\"]*)\" berhasil ditambahkan$")
	public void wishlist_berhasil_ditambahkan(String wl) throws Throwable {
		myWishlistPage = myWishlistPage.isWishListExist(wl);
	}

	@Given("^User mengklik  pada salah satu wishlist \"([^\"]*)\" pada Halaman My Wishlist$")
	public void user_mengklik_pada_salah_satu_wishlist_pada_Halaman_My_Wishlist(String wl) throws Throwable {
		myWishlistPage = myWishlistPage.clickMyWishlistList(wl);
	}

	@Given("^User mengklik tombol Send This Wishlist pada Halaman My Wishlist$")
	public void user_mengklik_tombol_Send_This_Wishlist_pada_Halaman_My_Wishlist() throws Throwable {
		myWishlistPage = myWishlistPage.clickSendThisWishlist();
	}

	@Then("^User mengisi email tujuan \"([^\"]*)\" pada Halaman My Wishlis$")
	public void user_mengisi_email_tujuan_pada_Halaman_My_Wishlis(String email) throws Throwable {
		myWishlistPage = myWishlistPage.setEmail1(email);
	}

	@Then("^User mengklik tombol Send pada Halaman My Wishlist$")
	public void user_mengklik_tombol_Send_pada_Halaman_My_Wishlist() throws Throwable {
		myWishlistPage = myWishlistPage.clickSend();
	}
	
	@Given("^User mengklik tombol  Add to Wishlist  pada Halaman Detail Product$")
	public void user_mengklik_tombol_Add_to_Wishlist_pada_Halaman_Detail_Product() throws Throwable {
	    detailProduct = detailProduct.clickAddToWishlist();
	}

	@Then("^Muncul notifikasi product berhasil ditambahkan ke wishlist$")
	public void muncul_notifikasi_product_berhasil_ditambahkan_ke_wishlist() throws Throwable {
		detailProduct = detailProduct.isProductAddedToWishlist();
	}
}
