Feature: Login User
User login ke dalam web application

Background: User berada pada Halaman Utama 
Given User berada di Main Page "http://automationpractice.com"


Scenario: Normal Skenario - User login
Skenario user login dengan menggunakan email dan word yang valid 
	Given User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	Then User berhasil sign in dan berada pada Halaman My Account 
	

Scenario: Negative Skenario - Login With Invalid Email Format 
Skenario user login dengan menggunakan format email yang tidak valid
	Given User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	Then Muncul notifikasi error invalid email address pada Halaman Authentication


Scenario: Negative Skenario - Login With Invalid Password
Skenario user login dengan menggunakan email yang valid dan word yang tidak valid 
	Given User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "xxx" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	Then Muncul notifikasi error invalid password pada Halaman Authentication