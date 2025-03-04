package Junit;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
 
public class OrderService {
 
    @Test
    void testInsufficientStock() {
        OrderService orderService = new OrderService();
        assertThrows(IllegalArgumentException.class, () -> {
            orderService.placeOrder(15);
        });
    }
 
    @Test
    void testCalculateTotalPrice() {
        OrderService orderService = new OrderService();
        double price = 100.0;
        int quantity = 5;
        double expectedTotal = price * quantity * (1 - orderService.getDiscount());
        assertEquals(expectedTotal, orderService.calPrice(price, quantity));
    }

	public Double calPrice(double price, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void placeOrder(int i) {
		// TODO Auto-generated method stub
		
	}
}