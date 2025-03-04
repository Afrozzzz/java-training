package Junit;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
public class OrderService2MultiThreadTest {
  private OrderService2 orderservice2;
 
  @BeforeEach
  public void setUp() {
    orderservice2 = new OrderService2();
  }
 
  @Test
  public void orderService2MultiThread() throws InterruptedException {
    int threadCount = 10;
    ExecutorService executor = Executors.newFixedThreadPool(threadCount);
    CountDownLatch latch = new CountDownLatch(threadCount);
 
    for (int i = 0; i < threadCount; i++) {
      executor.execute(() -> {
        try {
          orderservice2.placeOrder(1);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        } finally {
          latch.countDown();
        }
      });
    }
 
    latch.await(); // Wait for all threads to finish
    executor.shutdown();
 
    assertEquals(0, orderservice2.getstock());
  }
}