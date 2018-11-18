package Bank;

public class CurrentAcc extends BankAccount {

	private double cashCredit;
	
	{
		this.cashCredit=20000;
		
	}
	public CurrentAcc(){
    
	}
	public CurrentAcc(String accountHolderName,double amount){
		super(accountHolderName,amount);
		
	}
	
public double getcashCredit(){
	return cashCredit;
	
}
}