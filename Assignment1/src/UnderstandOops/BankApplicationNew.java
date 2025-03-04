package UnderstandOops;
 
import java.util.Scanner;
 
public class BankApplicationNew {
	private static final double intersetRate = 0;
	private static final int stockHoldings = 0;
	private static final String accNum = null;
	private static BankAccount[] accounts;
	private static int totalAccounts = 0;
	private static int maxAccounts = 5;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		accounts = new BankAccount[10];
		while (true) {
			System.out.println("\n Bank Application Menu:");
			System.out.println("1. create the Account");
			System.out.println("2. Display all the Accounts");
			System.out.println("3. Deposit Money");
 
			System.out.println("4. Withdraw Money");
			System.out.println("5.Transfer Money");
			System.out.println("6.Exit");
			System.out.print("Enter Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				displayAccounts();
				break;
			case 3:
				depositMoney(sc);
				break;
			case 4:
				withdrawMoney(sc);
				break;
			case 5:
				BuyStocks(sc);
				break;
			case 6:
				sellStocks(sc);
				break;
			case 7:
				transferMoney(sc);
				break;
			case 8:
				System.out.println("Thank You for using our Application...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice type");
 
			}
 
		}
	}

 
	private static void BuyStocks(Scanner sc) {
         System.out.println("Enter the quantity of stocks to buy:");
         int quantity=sc.nextInt();
         System.out.println("Enter the price per stock:");
         double pricePerStock=sc.nextDouble();
         BankAccount account = findAccount(accNum);
			if(account!=null) {
				((DematAccount)account).buyStocks(quantity, pricePerStock);
			}else {
				System.out.println("There is an error");
			}

	}
	public static void sellStocks(Scanner sc) {
		System.out.print("Enter demat account number: ");
		String accNum=sc.next();
		System.out.print("Enter no. of stocks u want to sell ");
		int stockNum = sc.nextInt();
		System.out.print("Enter price per stock ");
		double price = sc.nextDouble();
		BankAccount account = findAccount(accNum);
		if(account!=null) {
			((DematAccount) account).sellStocks(stockNum,price);
		}
		else
			System.out.println("Account not found");
	}
	private static void createAccount(Scanner sc) {
		if(totalAccounts>=maxAccounts)	{
			System.out.println("cannot create more accounts");
			return;
		}
		while (true) {
			System.out.println("\n Choose Account type:");
			System.out.println("1. Current account");
			System.out.println("2. Savings Account");
			System.out.println("3. Premium Savings account");
 
			System.out.println("4. Demat Account");
			System.out.print("Enter Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the account holder name:");
			String accountName=sc.next();
			System.out.println("Enter the account No :");
			String accountNumber=sc.next();
			System.out.println("Enter the initial balance:");
			double accountBalance=sc.nextDouble();
			switch(choice) {
			case 1:{
				accounts[totalAccounts] =new BankAccount(accountName,accountNumber,accountBalance);
				accounts[totalAccounts].display();
			}
			case 2:{
				System.out.println("Enter the interset rate:");
				double intersetRate=sc.nextDouble();
				accounts[totalAccounts]=new SavingsBankAccounts(accountName,accountNumber,accountBalance,intersetRate);
				accounts[totalAccounts].display();
			}
			case 3:{
				System.out.println("Enter the Bonus interset:");
				double bonusInterset=sc.nextDouble();
				accounts[totalAccounts] =new PremiumSavingsAccount(accountName,accountNumber,accountBalance,intersetRate,bonusInterset);
				accounts[totalAccounts].display();
			}
			case 4:{
//				System.out.println("Enter the stock holdings:");
//				double stockHoldings=sc.nextDouble();
			DematAccount demat=new DematAccount(accountName,accountName,accountBalance,stockHoldings);
				accounts[totalAccounts] =demat;
				accounts[totalAccounts].display();
			}
			default:
				System.out.println("Invalid choice");
			}
			totalAccounts++;
		}
	}

 
			private static void displayAccounts() {
				if (totalAccounts == 0) {
					System.out.println("No account to display");
				}
				System.out.println("Bank Account Details----- ");
				for (int i = 0; i < totalAccounts; i++) {
					accounts[i].display();
					System.out.println("---------------------");
				}
			}
 
			private static void depositMoney(Scanner sc) {
				System.out.println("Enter the account No :");
				String accNum = sc.next();
				BankAccount account = findAccount(accNum);
				if(account==null) {
					System.out.println("account not found");
				}
				System.out.println("Enter the choice (1.single deposit /2.multiple deposits) ,  choose it :");
				int choose = sc.nextInt();
				if (choose==1) {
					System.out.println("Enter the amount to deposit");
					double amount = sc.nextDouble();
					account.deposit(amount);

			}else if(choose==2) {
				System.out.println("Enter the number of deposits:");
				int numDeposits = sc.nextInt();
				double[] amounts =new double[numDeposits];
				for(int i=0;i<numDeposits;i++) {
					System.out.println("Enter deposit amount" + (i+1) +":");
					amounts[i]=sc.nextDouble();
				}
				account.deposit(amounts);
				System.out.println("deposited successfully!");
			}else {
				System.out.println("Invalid choice ! Please enter 1 or 2");
			}
			}
 
			private static BankAccount findAccount(String accNum) {
				for (int i = 0; i < totalAccounts; i++) {
					if (accounts[i].getAccountNo().equals(accNum)) {
						return accounts[i];
					}
 
				}
				return null;
}
 
	private static void withdrawMoney(Scanner sc) {
		System.out.println("Enter the account No :");
		String accNum = sc.next();
		System.out.println("Enter the amount to withdraw");
		double amount = sc.nextDouble();
		BankAccount account = findAccount(accNum);
		if(account ==null) {
			System.out.println("account not found!");
			return;
		}
		if(amount>0 && amount <= account.getbalance()) {
			account.withdraw(amount);
			System.out.println("successfully withdrawn");
 
	}else {
		System.out.println("Invalid withdrawal amount");
	}
 
	

 
}
	private static void transferMoney(Scanner sc) {
           System.out.println("Enter your account no");		
           String senderAccNum=sc.next();
           BankAccount senderAccount =findAccount(senderAccNum);
           if(senderAccount==null) {
        	   System.out.println("sender account not found!");
        	   return;
           }
           System.out.print("Enter reciepient's account no :");
           String recieveraccNum=sc.next();
           BankAccount recieverAccount =findAccount(recieveraccNum);
           if(recieverAccount==null) {
        	   System.out.println("recipient account not found");
        	   return;
           }
           System.out.println("Enter the amount to transfer");
           double amount=sc.nextDouble();
           if(amount>0 && amount<=senderAccount.getbalance()) {
//        	   senderAccount.withdraw(amount);
//        	   recieverAccount.deposit(amount);
        	   senderAccount.transfer(amount, recieverAccount);
        	   System.out.println("transfered Successfully...");
           }else {
        	   System.out.println("Invalid transfer amount or insufficient amount to transfer");
           }
	}
}