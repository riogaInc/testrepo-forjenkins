Feature: Register User
User register ke dalam web application

Background: User berada pada Halaman Utama 
Given User berada di Main Page "http://automationpractice.com"


Scenario: Negative Skenario - Register With Invalid Personal Information and Address Data
User melakukan register tanpa mengisi form isian pada form data personal information dan data address pada Halaman Authentication
	Given User mengklik tombol Sign In pada Halaman Utama
	And User mengisi email "indra.byan78@gmail.com" pada form create an account pada Halaman Authentication 
	And User mengklik tombol Create An Account pada Halaman Authentication
	And User mengklik tombol Register pada Halaman Authentication
	Then Muncul notifikasi bahwa field isian mandatory belum terisi pada Halaman Authentication
	

Scenario: Negative Skenario - Register With Registered Email
User melakukan register dengan menggunakan email yang sudah terdaftar 
	Given User mengklik tombol Sign In pada Halaman Utama
	And User mengisi email "indra.byan77@gmail.com" pada form create an account pada Halaman Authentication 
	And User mengklik tombol Create An Account pada Halaman Authentication
	Then Muncul notifikasi bahwa email sudah terdaftar pada Halaman Authentication Awal


Scenario Outline: Negative Skenario - Register With Registered Email 2
User melakukan register dengan menggunakan email yang sudah terdaftar ketika mengisi form personal information
	Given User mengklik tombol Sign In pada Halaman Utama
	And User mengisi email "indra.byan78@gmail.com" pada form create an account pada Halaman Authentication 
	And User mengklik tombol Create An Account pada Halaman Authentication
	And User mengisi data personal information dan data address pada Halaman Authentication "<title>" "<firstname>" "<lastname>" "<email>" "<password>" "<dayDOB>" "<monthDOB>" "<yearDOB>" "<company>" "<address>" "<city>" "<state>" "<zip>" "<country>" "<phone>" "<hp>" "<addAlias>"
	And User mengklik tombol Register pada Halaman Authentication
	Then Muncul notifikasi bahwa email sudah terdaftar pada Halaman Authentication
Examples:
|title|firstname|lastname|email|password|dayDOB|monthDOB|yearDOB|company|address|city|state|zip|country|phone|hp|addAlias|
|mr.|indra|byan|indra.byan77@gmail.com|indra|11|10|2018|salestock|BSD Road|Jakarta|Texas|20001|United States|02192098|08134567890|addnum1|


Scenario: Bug User Register-001 
Kesalahan notifikasi ketika user melakukan create and account dengan menggunakan email yang sudah terdaftar 
	Given User mengklik tombol Sign In pada Halaman Utama
	And User mengisi email "indra.byan77@gmail.com" pada form create an account pada Halaman Authentication 
	And User mengklik tombol Create An Account pada Halaman Authentication
	Then Terjadi kesalahan pada pesan notifikasi error "An account using this email address has already been registered. Please enter a valid password or request a new one." pada Halaman Authentication


Scenario Outline: Bug User Register-002
Ketika proses pengisian data ketika user melakukan register, jika pada isian dropdown Country dipilih “-” mengakibatkan form tidak dapat di submit dan memberikan notifikasi error terkait error kesalahan algoritma sistem kepada user 
	Given User mengklik tombol Sign In pada Halaman Utama
	And User mengisi email "indra.byan79@gmail.com" pada form create an account pada Halaman Authentication 
	And User mengklik tombol Create An Account pada Halaman Authentication
	And User mengisi data personal information dan data address pada Halaman Authentication "<title>" "<firstname>" "<lastname>" "<email>" "<password>" "<dayDOB>" "<monthDOB>" "<yearDOB>" "<company>" "<address>" "<city>" "<state>" "<zip>" "<country>" "<phone>" "<hp>" "<addAlias>"
	And User mengklik tombol Register pada Halaman Authentication
	Then Then Pesan notifikasi error yang berhubungan dengan algoritma system "There are 3 errors id_country is required. Country cannot be loaded with address->id_country Country is invalid"
Examples:
|title|firstname|lastname|email|password|dayDOB|monthDOB|yearDOB|company|address|city|state|zip|country|phone|hp|addAlias|
|mr.|indra|byan|indra.byan79@gmail.com|indra|11|10|2018|salestock|BSD Road|Jakarta|Texas|20001|-|02192098|08134567890|addnum1|


