package MultithreadingSer;

public class assignDeliveryAgent extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("delivery agent");
 
			Thread.sleep(5000);
			System.out.println("delivery agent assigned successfully");
 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Thread is running2"+ Thread.currentThread().getName());
	}
}