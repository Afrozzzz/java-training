package UnderstandOops;
 
public class BankAccount {
 
	private String AccountHolder;
	private String AccountNo;
	private double balance;
	public BankAccount(String AccountHolder,String AccountNo,double balance) {
		this.AccountHolder=AccountHolder;
		this.AccountNo=AccountNo;
		this.balance=balance;
	}
	public BankAccount() {
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder( String AccountHolder) {
	this.AccountHolder = AccountHolder;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String AccountNo) {
	this.AccountNo= AccountNo;
	}
	public Double getbalance() {
		return balance;
	}
	public void setbalance(Double balance) {
 
	if(balance >=0) {
		this.balance= balance;
	}else {
		System.out.println("Balance cannot be negative");
	}
	}
	public void Displaydetails() {
		System.out.println("The Holder name is:"+AccountHolder);
		System.out.println("The account no is:"+AccountNo);
		System.out.println("The balance is:"+balance);
		System.out.println("ThankYou.....");
	}

	public void deposit(double amount) {
		balance+=amount;
		System.out.println("the deposited money "+ amount + " The balance right now" + balance);
	}
	public void deposit(double...amounts) {
		double totaldeposit = 0.0;
		for(double amount:amounts) {
			if(amount>0) {
				totaldeposit += amount;
			}else {
				System.out.println("Negative name is not permissiable");
			}
		}
		balance+=totaldeposit;
		System.out.println(balance);
	}

	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
		balance-=amount;
		System.out.println("Rs"+ amount + "withdrwan ,The remaining balance:"+balance);
		System.out.println("--------------------------------------------");
	}else {
		System.out.println("Insufficient Balance");
	}
		}
	public void transfer(double amount,BankAccount targetAccount) {
		if(amount>0 && amount <= balance) {
			this.withdraw(amount);
			targetAccount.deposit(amount);
			System.out.println("Transfered amount:"+ amount + "  To account"+ targetAccount.getAccountNo());
		}else {
			System.out.println("invalid Transfer amount");
		}
	}
	 public void checkbalance() {
		 System.out.println("the balance:" + balance);
	 }
	public void display() {
		System.out.println("The account No is :"+ AccountHolder);
		System.out.println("The account No is :"+ AccountNo);
		System.out.println("The overall balance:"+ balance);
	}

 
}