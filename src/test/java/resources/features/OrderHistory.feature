Feature: Order History 
fitur untuk user malkukan management terhadap order history yang bersangkutan 

Background: User Sign in 
User melakukan login ke sistem 	
	Given User berada di Main Page "http://automationpractice.com"
	And User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication


Scenario: Normal Skenario - Reorder
User ingin melakukan reorder berdasarkan order history yang pernah dilakukannya 
	Given User mengklik tombol Order History and Detail pada Halaman My Account
	And User mengklik salah satu order history "TREYDGGRK" pada salah satu list order reference dan mengklik tombol Reorder pada Halaman Order History
	And User mengklik tombol Proceed to Checkout pada Halaman Shopping-Cart Summary 
	And User memilih alamat  pengiriman "test addreass" pada Halaman Address 
	And User memilih billing address sama dengan delivery address pada Halaman Address
	And User mengklik tombol Proceed to Checkout pada Halaman Address
	And User menceklis checkbox term and agreement pada Halaman Shipping
	And User mengklik tombol Proceed to Checkout pada Halaman Shipping
	And User memilih metode pembayaran pay by bank wire pada Halaman Payment 
	And User mengklik tombol I confirm my order  pada Halaman Order Summary
	Then Halaman Order Confirmation muncul