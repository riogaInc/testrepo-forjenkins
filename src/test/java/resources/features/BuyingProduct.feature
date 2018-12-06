Feature: Buying Product
User membeli produk melalui aplikasi 

Background: User Sign in 
User melakukan login ke sistem 	
	Given User berada di Main Page "http://automationpractice.com"
	And User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	

Scenario: Normal Skenario - Add Product to Cart and Buy Product
User ingin menambahkan produk ke dalam cart 
	Given User mengklik tombol Home pada Halaman My Account 
	And User memposisikan pointer mouse di atas menu women kemudian memilih T-shirt pada Halaman Utama
	And User memposisikan pointer mouse di atas list product dengan nama Faded Short Sleeve T-shirt dan mengklik More pada Halaman T-shirt 
	And User mengisi detail jumlah "2" , ukuran "M" , dan warna "color_13" pada  Halaman Detail Product
	And User mengklik tombol  Add to Cart pada Halaman Detail Product
	And User mengklik tombol Proceed to Checkout pada Pop Up Detail Cart pada Halaman Detail Product
	And User mengklik tombol Proceed to Checkout pada Halaman Shopping-Cart Summary 
	And User memilih alamat  pengiriman "test addreass" pada Halaman Address 
	And User memilih billing address sama dengan delivery address pada Halaman Address
	And User mengklik tombol Proceed to Checkout pada Halaman Address
	And User menceklis checkbox term and agreement pada Halaman Shipping
	And User mengklik tombol Proceed to Checkout pada Halaman Shipping
	And User memilih metode pembayaran pay by bank wire pada Halaman Payment 
	And User mengklik tombol I confirm my order  pada Halaman Order Summary
	Then Halaman Order Confirmation muncul
	
	

Scenario: Normal Skenario - Add Product to Cart Without Buying Product 
User ingin menambahkan produk ke dalam cart tanpa belanja
	Given User mengklik tombol Home pada Halaman My Account 
	And User memposisikan pointer mouse di atas menu women kemudian memilih T-shirt pada Halaman Utama
	And User memposisikan pointer mouse di atas list product dengan nama Faded Short Sleeve T-shirt dan mengklik More pada Halaman T-shirt 
	And User mengisi detail jumlah "2" , ukuran "M" , dan warna "color_13" pada  Halaman Detail Product
	And User mengklik tombol  Add to Cart pada Halaman Detail Product
	And User mengklik tombol Continue Shopping pada Pop Up Detail Cart pada Halaman Detail Product
	Then Item pada cart bertambah 
	
	
	