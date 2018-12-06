Feature: Newsletter
feature terkait fungsionalitas newsletter 


Scenario: Bug Newsletter-001
Ketika user telah memasukkan email berlangganan newsletter dan mensubmit email tersebut, notifikasi muncul pada field isian email untuk berlangganan newsletter
	Given User berada di Main Page "http://automationpractice.com"
	And User mengisi field isian email "indra.byan77@gmail.com" untuk newsletter dan mengklik tanda > pada Halaman Utama
	Then Field isian email seharusnya tidak berisi notifikasi 
	