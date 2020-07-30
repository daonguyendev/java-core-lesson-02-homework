# java-core-lesson-02-homework
Java Core Lesson 02 Homework

1. Test feature 1 - Input list of account customer information
Using the test case below to test this application
Which feature do you want you to do: 
1. Enter customer list information
2. Display customer list information
3. Deposit
4. Withdrawal
5. Transfer
Press feature which you want to choose or any other number to exit
=> Input: 1

Continue to input 2 account customer below and press enter:
Enter the number of customers you want to enter: 2
Customer number: 1
Enter your account number: 123
Enter your account name: dao
Enter your account amount: 1000

Customer number: 2
Enter your account number: 456
Enter your account name: teo
Enter your account amount: 2000

2. Test feature 2 - Print list of account customer information
Using the test case below to test this application
Which feature do you want you to do: 
1. Enter customer list information
2. Display customer list information
3. Deposit
4. Withdrawal
5. Transfer
Press feature which you want to choose or any other number to exit
=> Input: 2

Result:
Customer list information is: 
Number     Name                 Amount               
123        dao                  1000.0               
456        teo                  2000.0

3. Test feature 3 - Deposit for customer by account number
Which feature do you want you to do: 
1. Enter customer list information
2. Display customer list information
3. Deposit
4. Withdrawal
5. Transfer
Press feature which you want to choose or any other number to exit
=> Input: 3

Continue to input and press enter:
Enter the customer account number want to deposit: 123

Result:
You choose an account: 123

Please enter your deposit amount: 200
Deposit $200.0 successfully!
Your current amount after depositing is: 1200.0

4. Test feature 4 - Withdrawal for customer by account number
Which feature do you want you to do: 
1. Enter customer list information
2. Display customer list information
3. Deposit
4. Withdrawal
5. Transfer
Press feature which you want to choose or any other number to exit
=> Input: 4

Continue to input and press enter:
Enter the customer account number want to deposit: 123

Result:
You choose an account: 123

Please enter your withdrawal: 100
Withdrawal $100.0 successfully!
Your current amount after withdrawal is: 1098.9

5. Test feature 5 - transfer money from customer A to customer B
Which feature do you want you to do: 
1. Enter customer list information
2. Display customer list information
3. Deposit
4. Withdrawal
5. Transfer
Press feature which you want to choose or any other number to exit
=> Input: 5

Continue to input 2 amount of transferring/receiving like below and press enter:
Enter the account number of the sending customer: 123

Enter the account number of the receiving customer: 456

Enter the amount to transfer: 100

Result:
Account number 123 have just transferred: $100.0
Current amount of transferring customer after transferring is: 898.9000000000001
Account number 456 have just received: $100.0
Current amount of receiving customer after transferring is: 2200.0
