package UnderstandOops;
 
public class DematAccount  extends BankAccount {
	private int stockHoldings;
 
	public int getStockHoldings() {
		return stockHoldings;
	}
 
	public void setStockHoldings(int stockHoldings) {
		this.stockHoldings = stockHoldings;
	}
 
	public DematAccount() {
		super();
	}
 
	public DematAccount(String AccountHolder, String AccountNo, double balance,int stockHoldings) {
		super(AccountHolder, AccountNo, balance);
              this.stockHoldings=stockHoldings;
	}
	public void buyStocks(int quantity,double pricePerStock) {
		double totalCost=quantity*pricePerStock;
		if(getbalance()>=totalCost) {
			setbalance(getbalance()-totalCost);
			stockHoldings +=quantity;
			System.out.printf("Bought %d stocks for $%.2f , New balance : $%.2f%n",quantity,totalCost,getbalance());
		}else {
			System.out.println("Insufficient balance to buy stocks.");
		}
	}
	public void sellStocks(int quantity,double pricePerStock) {
		if(quantity<=0 ||pricePerStock<=0) {
			System.out.println("Invalid sell parameters");
			return;
		}
		if(stockHoldings>=quantity) {
			double earnings=quantity*pricePerStock;
			double revenue= earnings;
			setbalance(getbalance()+revenue);
			stockHoldings-=quantity;
			System.out.printf("Sold %d stocks for $%.2f , New balance : $%.2f%n",quantity,revenue,getbalance());
		}
	}
	@Override
	public void display() {
		super.display();
		System.out.println("stock holdings:"+ stockHoldings);
	}
 
}