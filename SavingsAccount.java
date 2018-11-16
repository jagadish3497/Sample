package dom.jagadish.diss;
import com.jagadish.ds.BankAccount;


public class SavingsAccount extends BankAccount {

	public SavingsAccount(String AccountHolderName,double amount){
		super(AccountHolderName,amount);
}
	public SavingsAccount(){
	}
	public SavingsAccount(String AccountHolderName,double accountbalance,boolean isSalaryAccount){
		super(AccountHolderName,accountbalance);
}
}
	
	
