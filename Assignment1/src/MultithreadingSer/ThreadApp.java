package MultithreadingSer;
 
public class ThreadApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter objc=new Counter();
TestThread2 t1= new TestThread2(); //from thread class
//instance of runnable
TestThread runnable=new TestThread();
Thread t2= new Thread(runnable);
Thread t3=new Thread( ()-> {
	 for(int i=0;i<5;i++)
	 {
		 objc.incrementCount();
	 }
});
Thread t4=new Thread( ()-> {
	 for(int i=0;i<4;i++)
	 {
		 objc.incrementCount();
	 }
});

// start the threads
// t1.start();
// 
// t2.start();
t3.start();
t4.start();
try {
	t3.join();
	t4.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Completed" +objc.getCount());

	}
	//synchronization
	// shared bankaccount -> users 2
	// balance -1000
	//user 1->t1-> t1->withdraw -100
	// user-2  parallel another thread ->t2->deposit-> 200->1200
	//inconsistent balance
	// method synchronization -key syn->all  threads can work but at one time only one thread 
}