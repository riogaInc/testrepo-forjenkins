Feature: Contact Us
User mengakses fitur Contact Us pada web application

Background: User berada pada Halaman Utama 
Given User berada di Main Page "http://automationpractice.com"

@dev
Scenario Outline: Normal Skenario - Submit Form Contact Us Without Login
Skenario user melakukan submit form contact us pad halaman contact us tanpa melakukan login 
	Given User mengklik tombol Contact Us pada Halaman Utama
	And User mengisi form Customer Service - Contact Us pada Halaman Contact "<subject_heading>" "<email>" "<order_ref>" "<msg>"
	And User mengklik tombol Send pada Halaman Contact
	Then Muncul Notifikasi bahwa pesan sukses terkirim pada Halaman Contact
Examples:
|subject_heading|email|order_ref|msg|
|Customer service|indra.byan77@gmail.com|123456|Barang yang dikirim salah|

@dev
Scenario Outline: Normal Skenario - Submit Form Contact Us With Login
Skenario user melakukan submit form contact us pad halaman contact us dengan melakukan login 
	Given User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	And User mengklik tombol Contact Us pada My Account
	And User mengisi form Customer Service - Contact Us setelah login pada Halaman Contact "<subject_heading>" "<email>" "<order_ref>" "<product>" "<msg>"
	And User mengklik tombol Send pada Halaman Contact
	Then Muncul Notifikasi bahwa pesan sukses terkirim pada Halaman Contact
Examples:
|subject_heading|email|order_ref|product|msg|
|Customer service||76236|1|Barang yang dikirim salah|


Scenario: Negative Skenario - Submit Form Contact Us Without Fill The Form Field  and  Without Login
Skenario user melakukan submit form contact us pada halaman contact us tanpa melakukan login di mana field inputan form tidak diisi dengan lengka
	Given User mengklik tombol Contact Us pada Halaman Utama
	And User mengklik tombol Send pada Halaman Contact
	Then Muncul Notifikasi bahwa field isian tidak boleh kosong pada Halaman Contact
	
	
Scenario: Negative Skenario - Submit Form Contact Us Without Fill The Form Field  and  With Login 
Skenario user melakukan submit form contact us pad halaman contact us dengan melakukan login 
	Given User mengklik tombol Sign In pada Halaman Utama 
	And User mengisi email "indra.byan77@gmail.com" dan password "indra" pada form sign pada Halaman Authentication
	And User mengklik tombol Sign In pada Halaman Authentication
	And User mengklik tombol Contact Us pada My Account
	And User mengklik tombol Send pada Halaman Contact
	Then Muncul Notifikasi bahwa field isian tidak boleh kosong pada Halaman Contact

	
