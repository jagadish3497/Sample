package Bank;

public class SavingsAcc extends BankAccount{
private boolean isSalaryAccount;
private double fixedDeposit;

public SavingsAcc(){
this.isSalaryAccount=true;
}
public boolean issalaryAccount() {
	return this.isSalaryAccount;
}
public SavingsAcc(String accountHolderName,double amount,double Fixeddeposit){
	super(accountHolderName,amount);
	this.isSalaryAccount=true;
	this.fixedDeposit=Fixeddeposit;
}

public SavingsAcc(String accountHolderName,double amount,boolean isSalaryAccount,double Fixeddeposit){
	super(accountHolderName,amount);
	this.isSalaryAccount=isSalaryAccount;
	this.fixedDeposit=Fixeddeposit;
}
public double getAccountBalance() {
	return getAccountBalance()+this.fixedDeposit;
}

}
