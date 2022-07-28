Table of Content
1. Individual Contributions Breakdown ………………………………………..	3
2.  Statement of Requirements ………………………………….….…………     	4
1.1 Statement              ………………………………………………….    	4   	
3. Glossary of Terms …………………………………………………………....	4
4.  System Requirements ……………………………………………................    	5
4.1 Enumerated Functional Requirements ……………………………....	5
4.2 Enumerated Nonfunctional Requirements ………………………….	5
5. Functional Requirements Specification ........................................................	6
5.1 Stakeholders ………………………………………………………….	6
5.2 Actors and Goals …………………………………………………….	6
6. Class Diagrams and Interface Specification ………………………………	6
6.1 Class Diagrams ……………………………………………………...	7
6.2 DataTypes and Operation Signatures ………………………………..	7-10
7. Conclusion ……………………..……………………………………………	10

1.     Statement of Requirements
1.1 Problem Statement:What Is an Automated Teller Machine (ATM)? An ATM is basically  a computer where you can check your account balance,  withdraw cash and access other financial services. This machine eliminates the need to interact with a human teller for many basic banking needs.An automatic teller machine accepts a cash card, interacts with the user, communicates with the central system to carry out the transaction, cash, and prints receipts. The system requires appropriate recordkeeping and security provisions. The system must handle concurrent access to the same account correctly. We design the software for the ATM machines.The cost of the shared system will be apportioned to the banks according to the number of customers with cash cards. In our ATM machine project we have used withdraw,check balance,password change and activity log features

2. Glossary of Terms:
Actors: The users that interact with a system.
User ID: The user name, or password by which a person is identified to a computer system or network.
File: User information is stored in a file.
Admin: The admin that manages the account management system.
Statement: This section keeps the track of  the system and they help you track changes in your energy, alertness and effectiveness throughout the day.
Withdraw: If the balance amount is greater than or equal to the withdrawal amount then Perform the transaction and give the user the desired amount.
Password change: Helps to change the user password to secure account.
Check Balance: The user can access bank deposits to check their account balance.
Sign out: After finishing their activity the user can log out from the system.

3. System Requirements
3.1 Enumerated Functional Requirements:
Identifier
Requirements
Admin
This will allow the author to insert data.
User
A user will be required to insert an ATM card and enter a personal identification number (PIN) - both of which will be sent to the bank for validation as part of each transaction. The customer will then be able to perform one or more transactions.
Withdraw
This will allow users to withdraw their money after all verification.
Check Balance
This will allow users to check their account balance.
Password Change
This will allow users to change their password.
Statement
This will allow users to check their statements & history.
Exit
Users can log out from the system.


3.2 Enumerated Nonfunctional Requirements
Identifier
Requirements
Inheritance
System must have Inheritance.
Polymorphism
System must have Polymorphism.
Encapsulation 
System must have Encapsulation .
Abstract
System must have an Abstract.
Access Modifier
System must have  Access Modifier



4. Functional Requirements Specification 
4.1 Stakeholders 
Stakeholders have an interest in this system and, ultimately, its success:
ATM Card User:  Using an ATM, customers can access their bank deposit or credit accounts in order to make a variety of financial transactions, most notably cash withdrawals and balance checking. They can easily withdraw money without going to the bank. Moreover, they can withdraw money from other bank’s ATM. 

4.2 Actors and Goals 
Actor
Rule 
Goal
Author
The author will be able to create an account for a user and check all kinds of statements. 
The author’s job is to create accounts for the users so that they can access their bank deposits.
User
The user will be able to access their bank deposit to check their account statements. like, checking balance, withdrawing money & checking their statement.
The user’s job is to get access to the bank account by logging in with their security code and withdrawing money or doing other work.





5. Class Diagrams and Interface Specification
5.1 Class Diagrams







5.2 Data Types and Operation Signatures
Class: main
Attributes:

Methods:
           main():void


Class: admin
Attributes:

Methods:
insert_data() - Public function that logs the admin into the system and insert the user data into a file.                                                                                                                                                                                  


getLogin() – abstract function 
Class: admin_Data
Attributes:
Account_id:String- Private variable that saves the user Account id
User_name:String- Private variable that saves the user name
Pass:String- Private variable that saves the user password
amount:String- Private variable that saves the user amount
Methods:
getAccount_id():return String- Public function that retrieves account id.
getUser_name():return String- Public function that retrieves user name.
getpass():return String- Public function that retrieves user password.
getamount():return String- Public function that retrieves user amount.
setAccount_id() :Public function that sets account id.
setName() :Public function that sets name.
setpass() :Public function that sets password.
setAmount() :Public function that sets amount.


Class: Account
Attributes:
Methods:
getLogin() - Public function that logs the user into the system and choose their option
  Class: CheckBalance
Attributes:
Methods:
CheckBalance():Public function that the user can check the main balance.
 Class: withdraw
Attributes:
Sum:int- Private variable that saves the user amount
Methods:
WithDraw() - Public function that the user can withdraw the balance given a user id and password.
CheckBalance() - Public function that the user can check the balance existing amount.
Class: CheckBalance
Attributes:
Methods:
PassWord_Change()-Public function that the user can change their password by using this method.
Class: Log_Mgs
Attributes:
Methods:
Log() - Public function that the save the user history 
Class: Log_activity
Attributes:
Methods:
Log() – abstract class that pass the two parameter
 Class: Statement
Attributes:
Methods:
Check_statement() – public functions that the user can input their User id and check  their payment history.

6. Conclusion
As the banking sector computerized day to day,ATMs have become a part of the modern banking system.ATM SYSTEM "has been developed as the best flexible and efficient project within the available resources and time in Future Care has been laken at each step to make it more user friendly so that users can add new features wherever necessary while using this automated system.It May be Enhanced or Requirement of User.This technology is simple ,safe and secure and people feel satisfaction to use it.
