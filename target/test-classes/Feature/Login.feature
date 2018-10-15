Feature: Login User
fitur untuk user melakukan login 

Background: User berada pada Main Page
Given User berada di Main Page "https://www.amazon.com/"
	
Scenario: Normal Skenario - User login
Given User melakukan hover pada menu Account&Lists di Main Page
And User mengklik tombol Sign In pada menu Account&Lists di Main Page
And User berada pada Sign In Page
And User mengisi email pada textbox Email "satrioajiewijaya@gmail.com" pada Sign In Page
And User mengklik tombol Continue pada Sign In Page
And User mengisi email pada textbox Password "Gekiku24" pada Sign In Page
And User mengklik tombol Sign In pada Sign In Page
Then User berada di Main Page "https://www.amazon.com/"
And Nama user "satrio" muncul pada menu Account&Lists di Main Page