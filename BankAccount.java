package com.jagadish.ds;//Collection of logical classes.....

public abstract class BankAccount {
	//static variable....(it does not wait till object creation & loads after the class loads..........)
	//A single copy to be shared by all instances of the class
	private static int autoAccountNo;
	
	//instance variable or class variable(can't access without object creation)....... 
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	// init Block(it executes before constructors...........)
	{
		accountNo=++autoAccountNo;
	}
	
	//consturction overloading.....
	public BankAccount()//default contstructor---->Intialize instance or class variable......
	{	
		accountHolderName="unknown";
		accountBalance=0;
	}
	public BankAccount(String accountHolderName, double accountBalance )//parameterized constructor.......
	{
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	//setter method (conceptioul method)-->intialize or Modifies or reintalize the member variable... 
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	//getter method
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	// service methods
	public void withdraw(double amount) {
		if(amount>this.accountBalance){
			System.out.println("The amount you are trying is greater than Account Balance");
		} else if(amount<=0){
			System.out.println("Enter valid amount");
		}else if((this.accountBalance-amount)<1000){
			System.out.println("Minimum Bal is 1000");
		} else{
		this.accountBalance-=amount;
	}
	}
	
	public void deposit(double amount){
		if(amount<=0){
			System.out.println("Enter Valid amount");
		}else{
			System.out.println("Amount Deposited has been done");
		this.accountBalance+=amount;
	}
	}
	
	//main method is only for exectuion not for logics....
	public static void main(String[] args){
		
		//BankAccount acc1=new BankAccount();
		//BankAccount acc2=new BankAccount("Jai",5000);
		//acc2.withdraw(4500);
		//acc2.deposit(10000);
		//double a=acc2.getAccountBalance();
		//System.out.println("The total amount is " +a);
		
	}
}









//Access Specifiers
//1.within a class
//private YES public Yes default YES
//2.Outside a class within a package
//private NO public Yes default YES
//3.Outside class as well as outside package
//private NO public Yes default No

// 