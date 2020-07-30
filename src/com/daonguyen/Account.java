package com.daonguyen;

import java.util.Scanner;

public class Account {
    private long number;
    private String name;
    private double amount;

    private Scanner scanner = new Scanner(System.in);

    public Account() {}

    public Account(long number, String name, double amount) {
        this.number = number;
        this.name = name;
        this.amount = amount;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double withdrawal() {
        scanner = new Scanner(System.in);
        double withdrawalFee = 1.1, result;

        System.out.print("\nPlease enter your withdrawal: ");
        result = scanner.nextDouble();

        if (result >= 0 && result <= (amount - withdrawalFee)) {
            amount = amount - (result + withdrawalFee);
            System.out.println("Withdrawal $" + result + " successfully!");
            System.out.println("Your current amount after withdrawal is: " + amount);
        } else {
            System.out.println("Invalid withdrawal. Please check it again!");
        }

        return result;
    }

    public double deposit() {
        scanner = new Scanner(System.in);
        double result;

        System.out.print("\nPlease enter your deposit amount: ");
        result = scanner.nextDouble();

        if (result >= 0) {
            amount = amount + result;
            System.out.println("Deposit $" + result + " successfully!");
            System.out.println("Your current amount after depositing is: " + amount);
        } else {
            System.out.println("Invalid deposit. Please check it again!");
        }

        return result;
    }

    void printAccount() {
        System.out.printf("%-10s %-20s %-20s \n", number, name, amount);
    }
}
