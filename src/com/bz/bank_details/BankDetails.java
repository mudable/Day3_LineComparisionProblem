package com.bz.bank_details;

import java.util.Scanner;

public class BankDetails {
	long accountNumber;
	String customerName;
	int customerAge;
	static String bankName = "SBI";

	public void display(BankDetails obj) {

		System.out.println("Bank name is:" + bankName);
		System.out.println("Account Number is" + obj.getAccountNumber());
		System.out.println("customer Name is:" + obj.getCustomerName());
		System.out.println("customer Name is:" + obj.getCustomerAge());
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public static void main(String[] args) {

		BankDetails obj = new BankDetails();
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the account number");
		long accountNumber = scan.nextLong();

		System.out.println("Enter the customer name");
		String customerName = scan.next();
		System.out.println("Enter the customer age");
		int customerAge = scan.nextInt();

		obj.setAccountNumber(accountNumber);
		obj.setCustomerName(customerName);

		obj.setCustomerAge(customerAge);
		obj.display(obj);
	}
}
