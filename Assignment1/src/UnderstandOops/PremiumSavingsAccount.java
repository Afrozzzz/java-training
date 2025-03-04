package UnderstandOops;
 
public class PremiumSavingsAccount extends SavingsBankAccounts{
	private double bonusInterset;
 
	public PremiumSavingsAccount() {
		super();
	}

 
	public PremiumSavingsAccount(String AccountHolder, String AccountNo, double balance, double intersetRate,double bonusInterset) {
		super(AccountHolder, AccountNo, balance, intersetRate);
          this.bonusInterset=bonusInterset;
	}
 
	public double getBonusInterset() {
		return bonusInterset;
	}
 
	public void setBonusInterset(double bonusInterset) {
		this.bonusInterset = bonusInterset;
	}
 
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			super.deposit(amount);
			double extraBonus = (amount * bonusInterset) / 100;
 
//			double balance1 = super.getbalance();
//			balance1 += extraBonus;
			setbalance(getbalance()+extraBonus);
 
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
 
	@Override
	public void deposit(double... amounts) {
		double totaldeposit = 0.0;
		for (double amount : amounts) {
			if (amount > 0) {
 
				totaldeposit += amount;
 
			} else {
				System.out.println("Negative number is not permissiable" + amount);
			}
 
		}
		if (totaldeposit > 0) {
			super.deposit(totaldeposit);
			double bonusOnTotal = (totaldeposit * bonusInterset) / 100;
			setbalance(getbalance()+bonusOnTotal);
			System.out.println("Bonus interset of " + bonusOnTotal + "added on total deposit");
 
		} else {
			System.out.println(" No valid deposit amounts");
		}
 
	}
 
	@Override
	public void display() {
		super.display();
 
		System.out.println("Bonus interset rate:" + bonusInterset + "%");
	}
 
}