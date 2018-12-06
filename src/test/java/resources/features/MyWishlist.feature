Feature: My Wishlist
User mengorganisir wishlist yang dia miliki 

Background: User Sign in 
User melakukan login ke sistem 	
	Given User berada di Main Page "http://automationpractice.com"
	And User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication


Scenario Outline: Normal Skenario - Add My Wishlist
User ingin menambah kelompok wishlist 
	Given User mengklik tombol My Wishlist pada Halaman My Account 
	And User mengisi nama wishlist "<wishlit_name>" pada Halaman My Wishlist
	And User mengklik tombol save pada Halaman My Wishlist
	Then Wishlist "<wishlit_name>" berhasil ditambahkan
Examples:
|wishlit_name|
|wishlist number 3|


Scenario: Bug My Wishlist-001 - Send My Wishlist
Pengecekan Bug Pada My Wishlist ketika akan mengirimkan wishlist ke email 
	Given User mengklik tombol My Wishlist pada Halaman My Account
	And User mengklik  pada salah satu wishlist "wishlist number 1" pada Halaman My Wishlist
	And User mengklik tombol Send This Wishlist pada Halaman My Wishlist
	Then User mengisi email tujuan "satrioajiewijaya@gmail.com" pada Halaman My Wishlis
	And User mengklik tombol Send pada Halaman My Wishlist
	

Scenario: Normal Skenario - Add Product to Wishlist
User ingin menambahkan produk ke dalam wishlist
	Given User mengklik tombol Home pada Halaman My Account 
	And User memposisikan pointer mouse di atas menu women kemudian memilih T-shirt pada Halaman Utama
	And User memposisikan pointer mouse di atas list product dengan nama Faded Short Sleeve T-shirt dan mengklik More pada Halaman T-shirt 
	And User mengisi detail jumlah "2" , ukuran "M" , dan warna "color_13" pada  Halaman Detail Product
	And User mengklik tombol  Add to Wishlist  pada Halaman Detail Product
	Then Muncul notifikasi product berhasil ditambahkan ke wishlist