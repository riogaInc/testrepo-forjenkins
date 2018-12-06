package StepDefinition;

import PageObject.MyAccount;
import PageObject.OrderHistoryPage;
import PageObject.ShoppingCartSum;
import cucumber.api.java.en.Given;

public class OrderHistory {
	OrderHistoryPage orderHistoryPage;
	MyAccount myAccount;
	ShoppingCartSum shoppingCartSum;
	
	@Given("^User mengklik tombol Order History and Detail pada Halaman My Account$")
	public void user_mengklik_tombol_Order_History_and_Detail_pada_Halaman_My_Account() throws Throwable {
		orderHistoryPage = myAccount.navigateToOrderHistoryAndDetail();
	}

	@Given("^User mengklik salah satu order history \"([^\"]*)\" pada salah satu list order reference dan mengklik tombol Reorder pada Halaman Order History$")
	public void user_mengklik_salah_satu_order_history_pada_salah_satu_list_order_reference_dan_mengklik_tombol_Reorder_pada_Halaman_Order_History(String orderName) throws Throwable {
		shoppingCartSum = orderHistoryPage.clickOrderHistory(orderName).clickReorder();
	}
}
