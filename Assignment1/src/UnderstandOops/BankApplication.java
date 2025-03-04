package UnderstandOops;
 
public class BankApplication {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the holder name:");
//		String AccountHolder=sc.next();
//		System.out.println("Enter the account No:");
//		String AccountNo=sc.next();
//		System.out.println("Enter the amount:");
//		double balance=sc.nextDouble();
//		BankAccount  obj =new BankAccount(AccountHolder,AccountNo,balance);
//		BankAccount  obj =new BankAccount("Vinay","SBIN0089789",1000);
//		obj.AccountHolder="Afroz";
//		obj.AccountNo="ICICN0098981";
//		obj.balance=2000.00;
//		obj.display();
//
//		obj.deposit(10000);
//		obj.display();
//
//		obj.withdraw(2300);
//		obj.display();
//		obj.withdraw(12000);
//		obj.display();
//		obj.Displaydetails();
//		
//		obj.setAccountHolder("Lalithya");
//		obj.setAccountNo("HDFCN0001234");
//		obj.setbalance(-1000.00);
//		obj.Displaydetails();

//		BankAccount sa=new SavingsBankAccounts("Vinay","ICICN89877",100,6);
//		sa.display();
//		sa.deposit(1000);
//		
//		System.out.println("------------------------");
//		sa.display();
//     ((SavingsBankAccounts)sa).setIntersetRate(15);
//     sa.display();
////     sa.deposit(500);
//		sa.display();
//		System.out.println("------------------------");
//     sa.deposit(100,200,-50,300);
////     sa.display();
//		BankAccount p1=new BankAccount("Vinay","ICICN0078930",10000);
//		BankAccount p2=new BankAccount("Rahul","ICICN0080127",5000);
//		p1.checkbalance();
//		p2.checkbalance();
//		p1.transfer(2000, p2);
//		p1.checkbalance();
//		p2.checkbalance();
//		SavingsBankAccounts s1=new SavingsBankAccounts("Afroz","ICICN0094911",1000,6);
//		p1.transfer(1000, s1);
//		s1.checkbalance();
//		BankAccount sa=new SavingsBankAccounts("Vinay","ICICN0078930",100,6);
//		BankAccount pa=new PremiumSavingsAccount("Rahul","ICICN0094912",100,6,2);
////		PremiumSavingsAccount pa=new PremiumSavingsAccount("Somu","ICICN0078930",100,6,1);
//		System.out.println("savings Account------");
//		sa.display();
//		sa.deposit(100,200,300);
//		sa.display();
//		System.out.println("premium account-----");
//		pa.display();
//		pa.deposit(200,7000,900);
//		pa.display();
		DematAccount d1=new DematAccount("Ajay","icicn00",10000,50);
		d1.display();
		d1.buyStocks(20,50);
		d1.display();
		d1.sellStocks(10, 60);
		d1.display();

	}
 
}