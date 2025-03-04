package MultithreadingSer;

public class OrderApp {
	 
	public static void main(String[] args) {
		takeOrder t1=new takeOrder();
		processPayment t2= new processPayment();
		assignDeliveryAgent t3=new assignDeliveryAgent();
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("process successfully completed");

	}
	//synchronization
	// shared bankaccount -> users 2
	// balance -1000
	//user 1->t1-> t1->withdraw -100
	// user-2  parallel another thread ->t2->deposit-> 200->1200
	//inconsistent balance
	// method synchronization -key syn->all  threads can work but at one time only one thread 
}