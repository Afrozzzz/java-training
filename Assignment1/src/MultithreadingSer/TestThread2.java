package MultithreadingSer;



public class TestThread2 extends Thread{
 
	@Override
	public void run() {

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		// TODO Auto-generated method stub
		System.out.println("Thread is running"+ Thread.currentThread().getName());
	}
 
}