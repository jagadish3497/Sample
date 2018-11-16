 package com.jagadish.dis;

import com.jagadish.ds.BankAccount;

import dom.jagadish.diss.*;

public class TestBankAccount {
	public TestBankAccount(){
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("Jai");
	}
	public static void testSavingAccount(){
		SavingsAccount savingAcc = new SavingsAccount("jai",5000);
		System.out.println("Your account no is  " +savingAcc.getAccountNo());
		System.out.println("Your amount is " +savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Your amount is " +savingAcc.getAccountBalance());
		savingAcc.withdraw(4000);
		
		System.out.println("Your amount is " +savingAcc.getAccountBalance());
		System.out.println("=============================");
		
	}
	public static void testCurrentAccount(){
		CurrentAccount currentAcc = new CurrentAccount("jai",40000);
		System.out.println("Your account no is  " +currentAcc.getAccountNo());
		System.out.println("Your amount is " +currentAcc.getAccountBalance());
		System.out.println("Your amount is " +currentAcc.getAccountBalance());
		
		currentAcc.withdraw(50000);
		System.out.println("Your amount is " +currentAcc.getAccountBalance());
		System.out.println("OD amount is " +currentAcc.getodlimit());
		System.out.println("=============================");
	}
	public static void main(String[] args){
		//testSavingAccount();
		testCurrentAccount();
	}
}
