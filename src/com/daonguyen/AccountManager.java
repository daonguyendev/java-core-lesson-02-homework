package com.daonguyen;

import java.util.Scanner;

public class AccountManager {
    private static Scanner scanner = new Scanner(System.in);

    private static void inputAccount(Account account) {
        System.out.print("Enter your account number: ");
        account.setNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter your account name: ");
        account.setName(scanner.nextLine());

        System.out.print("Enter your account amount: ");
        account.setAmount(scanner.nextDouble());
    }

    public static void main(String[] args) {
        Account customersArray[] = null;
        int feature, customersNumber = 0;
        long transferringNumber, currentNumber, receivingNumber, afterTransferringNumber;
        boolean flag = true;

        do {
            System.out.println("Which feature do you want you to do: ");
            System.out.println("1. Enter customer list information\n"
                    + "2. Display customer list information\n"
                    + "3. Deposit\n"
                    + "4. Withdrawal\n"
                    + "5. Transfer\n"
                    + "Press feature which you want to choose or any other number to exit");
            feature = scanner.nextInt();

            switch (feature) {
                case 1:
                    System.out.print("\nEnter the number of customers you want to enter: ");
                    customersNumber = scanner.nextInt();
                    customersArray = new Account[customersNumber];

                    for (int i = 0; i < customersNumber; i++) {
                        System.out.println("Customer number: " + (i + 1));
                        customersArray[i] = new Account();
                        inputAccount(customersArray[i]);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nCustomer list information is: ");
                    System.out.printf("%-10s %-20s %-20s \n", "Number", "Name", "Amount");

                    for (int i = 0; i < customersNumber; i++) {
                        customersArray[i].printAccount();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\nEnter the customer account number want to deposit: ");
                    transferringNumber = scanner.nextLong();

                    for (int i = 0; i < customersNumber; i++) {
                        currentNumber = customersArray[i].getNumber();

                        if (transferringNumber == currentNumber) {
                            System.out.println("You choose an account: " + currentNumber);
                            customersArray[i].deposit();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nEnter the customer account number to withdraw: ");
                    transferringNumber = scanner.nextLong();

                    for (int i = 0; i < customersNumber; i++) {
                        currentNumber = customersArray[i].getNumber();

                        if (transferringNumber == currentNumber) {
                            System.out.println("You choose an account: " + currentNumber);
                            customersArray[i].withdrawal();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    double sending, receiving, transferAmount;
                    System.out.print("\nEnter the account number of the sending customer: ");
                    transferringNumber = scanner.nextLong();
                    System.out.print("\nEnter the account number of the receiving customer: ");
                    receivingNumber = scanner.nextLong();

                    for (int i = 0; i < customersNumber; i++) {
                        currentNumber = customersArray[i].getNumber();

                        if (transferringNumber == currentNumber) {
                            sending = customersArray[i].getAmount();

                            for (int j = 0; j < customersNumber; j++) {
                                afterTransferringNumber = customersArray[j].getNumber();

                                if (receivingNumber == afterTransferringNumber) {
                                    receiving = customersArray[j].getAmount();
                                    System.out.print("\nEnter the amount to transfer: ");
                                    transferAmount = scanner.nextDouble();

                                    if (transferAmount <= sending) {
                                        sending = sending - transferAmount;
                                        receiving = receiving + transferAmount;
                                        customersArray[i].setAmount(sending);
                                        customersArray[j].setAmount(receiving);

                                        System.out.println("Account number " + currentNumber + " have just transferred: $" + transferAmount);
                                        System.out.println("Current amount of transferring customer after transferring is: " + (customersArray[i].getAmount() - transferAmount));
                                        System.out.println("Account number " + afterTransferringNumber + " have just received: $" + transferAmount);
                                        System.out.println("Current amount of receiving customer after transferring is: " + (customersArray[j].getAmount() + transferAmount));
                                    } else {
                                        System.out.println("Invalid transfer amount!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Good Bye And See You Later!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
