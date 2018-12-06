package StepDefinition;

import PageObject.AbstractPage;
import PageObject.Address;
import PageObject.DetailProduct;
import PageObject.HalamanUtama;
import PageObject.MyAccount;
import PageObject.Payment;
import PageObject.Shipping;
import PageObject.ShoppingCartSum;
import PageObject.Tshirt;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BuyingProduct {
	MyAccount myAccount;
	HalamanUtama halamanUtama;
	Tshirt tshirt;
	DetailProduct detailProduct;
	ShoppingCartSum shoppingCartSum;
	Address address;
	Shipping shipping;
	Payment payment;
	
	@Given("^User mengklik tombol Home pada Halaman My Account$")
	public void user_mengklik_tombol_Home_pada_Halaman_My_Account() throws Throwable {
		halamanUtama = myAccount.navigateToHome();
	}

	@Given("^User memposisikan pointer mouse di atas menu women kemudian memilih T-shirt pada Halaman Utama$")
	public void user_memposisikan_pointer_mouse_di_atas_menu_women_kemudian_memilih_T_shirt_pada_Halaman_Utama() throws Throwable {
		tshirt =  halamanUtama.navigateToWomenTShirt();
	}

	@Given("^User memposisikan pointer mouse di atas list product dengan nama Faded Short Sleeve T-shirt dan mengklik More pada Halaman T-shirt$")
	public void user_memposisikan_pointer_mouse_di_atas_list_product_dengan_nama_Faded_Short_Sleeve_T_shirt_dan_mengklik_More_pada_Halaman_T_shirt() throws Throwable {
		detailProduct = tshirt.navigateToDetailProduct();
	}

	@Given("^User mengisi detail jumlah \"([^\"]*)\" , ukuran \"([^\"]*)\" , dan warna \"([^\"]*)\" pada  Halaman Detail Product$")
	public void user_mengisi_detail_jumlah_ukuran_dan_warna_pada_Halaman_Detail_Product(String jum, String size, String color) throws Throwable {
		detailProduct = detailProduct.setQuantity(jum).setSize(size).setColor(color);
	}

	@Given("^User mengklik tombol  Add to Cart pada Halaman Detail Product$")
	public void user_mengklik_tombol_Add_to_Cart_pada_Halaman_Detail_Product() throws Throwable {
		detailProduct = detailProduct.clickAddToCart();
	}

	@Given("^User mengklik tombol Proceed to Checkout pada Pop Up Detail Cart pada Halaman Detail Product$")
	public void user_mengklik_tombol_Proceed_to_Checkout_pada_Pop_Up_Detail_Cart_pada_Halaman_Detail_Product() throws Throwable {
		shoppingCartSum = detailProduct.clickProceedToCheckoutPopUp();
	}

	@Given("^User mengklik tombol Proceed to Checkout pada Halaman Shopping-Cart Summary$")
	public void user_mengklik_tombol_Proceed_to_Checkout_pada_Halaman_Shopping_Cart_Summary() throws Throwable {
		address = shoppingCartSum.navigateToAddress();
	}

	@Given("^User memilih alamat  pengiriman \"([^\"]*)\" pada Halaman Address$")
	public void user_memilih_alamat_pengiriman_pada_Halaman_Address(String add) throws Throwable {
		address = address.setDeliveryAdd(add);
	}

	@Given("^User memilih billing address sama dengan delivery address pada Halaman Address$")
	public void user_memilih_billing_address_sama_dengan_delivery_address_pada_Halaman_Address() throws Throwable {
		address = address.checkDeliverySameWithBillAdd();
	}

	@Given("^User mengklik tombol Proceed to Checkout pada Halaman Address$")
	public void user_mengklik_tombol_Proceed_to_Checkout_pada_Halaman_Address() throws Throwable {
		shipping = address.navigateToShipping();
	}

	@Given("^User menceklis checkbox term and agreement pada Halaman Shipping$")
	public void user_menceklis_checkbox_term_and_agreement_pada_Halaman_Shipping() throws Throwable {
	    shipping = shipping.checkTermAgreement();
	}

	@Given("^User mengklik tombol Proceed to Checkout pada Halaman Shipping$")
	public void user_mengklik_tombol_Proceed_to_Checkout_pada_Halaman_Shipping() throws Throwable {
	    payment = shipping.navigateToPayment();
	}

	@Given("^User memilih metode pembayaran pay by bank wire pada Halaman Payment$")
	public void user_memilih_metode_pembayaran_pay_by_bank_wire_pada_Halaman_Payment() throws Throwable {
	    payment = payment.payByBankWire();
	}

	@Given("^User mengklik tombol I confirm my order  pada Halaman Order Summary$")
	public void user_mengklik_tombol_I_confirm_my_order_pada_Halaman_Order_Summary() throws Throwable {
		payment = payment.clickConfirmMyOrder();
	}

	@Then("^Halaman Order Confirmation muncul$")
	public void halaman_Order_Confirmation_muncul() throws Throwable {
		payment = payment.isOrderConfirmationPage();
	}
	
	@Given("^User mengklik tombol Continue Shopping pada Pop Up Detail Cart pada Halaman Detail Product$")
	public void user_mengklik_tombol_Continue_Shopping_pada_Pop_Up_Detail_Cart_pada_Halaman_Detail_Product() throws Throwable {
		detailProduct = detailProduct.clickContinueShoppingPopUp();
	}

	@Then("^Item pada cart bertambah$")
	public void item_pada_cart_bertambah() throws Throwable {
		AbstractPage.isCartNotEmpty();
	}

}
