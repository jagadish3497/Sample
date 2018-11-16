package dom.jagadish.diss;

import com.jagadish.ds.BankAccount;

public class CurrentAccount extends BankAccount {
	private double odlimit;

	public CurrentAccount(String AccountHolderName,double amount){
		super(AccountHolderName,amount);
	this.odlimit=20000;
	}
	public double getodlimit (){
		return odlimit;
	}
	@Override
	public void withdraw(double amount){
		if((this.getAccountBalance()+this.odlimit)<amount){
			System.out.println("OverDraft Reached");
		}
		else if(amount<=0){
			System.out.println("Invalid Amount");
		}else if((this.getAccountBalance()-amount)<0){
			double odamount=amount-this.getAccountBalance();
			this.accountBalance=0;
			this.odlimit-=odamount;
		}
		else{
			this.accountBalance-=this.accountBalance;
		}
	}
}
