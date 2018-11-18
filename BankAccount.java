package Bank;

public abstract class BankAccount {

	private static int autoAccountNo;
	private static double totalCashInBank;
	

private int accountNo;
private String accountHolderName;
private double accountBalance;

{
	 
	accountNo=++autoAccountNo;	
}
public BankAccount(){ 

	accountHolderName="unknow";
	accountBalance= 0;
}
public BankAccount(String accountHolderName,double accountBalance){

	this.accountHolderName=accountHolderName;
	this.accountBalance= accountBalance;
	totalCashInBank+=accountBalance;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

public double getAccountBalance() {
	return accountBalance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public int getAccountNo() {
	return accountNo;
}
public static double getTotalCashInBank() {
	return totalCashInBank;
}


public static void testSavingAccount(){
SavingsAcc savacc= new SavingsAcc("deva",5000,50000);
System.out.println("Account name is:"+savacc.getAccountHolderName());
System.out.println("Account no is:"+savacc.getAccountNo());

System.out.println("Account Balance after deposit "+savacc.getAccountBalance());
System.out.println("Account Balance after withdraw "+savacc.getAccountBalance());
}
public static void testCurrentAccount(){
CurrentAcc curacc= new CurrentAcc("chandu",40000);
System.out.println("Account name is:"+curacc.getAccountHolderName());
System.out.println("Account no is:"+curacc.getAccountNo());

System.out.println("Account Balance after deposit "+curacc.getAccountBalance());
System.out.println("cash credit Balance after withdraw "+curacc.getcashCredit());
}
public static void main(String args[]){
//testBankAccountMethod();
testCurrentAccount();
double cash=Employee.getTotalSalaryOfAllEmployees();
System.out.println(cash);
//testSavingAccount();
}

}