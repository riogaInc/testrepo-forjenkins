Feature: Forgot Password
feature terkait fungsionalitas untuk melakukan forgot password

Background: User berada pada Halaman Utama 
	Given User berada di Main Page "http://automationpractice.com"
	And User mengklik tombol Sign In pada Halaman Utama

@dev
Scenario: Normal Skenario - Forgot Password
Skenario user lupa password dan melakukan reset terhadap password
	Given User mengklik link Forgot Your Password? pada Halaman Authentication
	And User mengisi field email address  "indra.byan77@gmail.com" pada Halaman Forgot your password 
	And User mengklik tombol Retrieve Password  pada Halaman Forgot your password
	Then Muncul notifikasi bahwa email konfirmasi sudah terkirim ke alamat email yang di inputkan user 