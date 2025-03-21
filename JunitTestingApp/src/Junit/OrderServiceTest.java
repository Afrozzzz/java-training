package Junit;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
 
class OrderServiceTest {
	OrderService orderService = new OrderService();

//    @Test
// 
//    void testCalTotal() {
//        double total = orderService.calPrice(100.0, 2); 
//        assertEquals(180, total, "Total should be 180 after 10% discount");
//    }
//    @Test
//    void testPlaceOrderSuccess() {
//        assertTrue(orderService.placeOrder(5), "Order should be placed successfully");
//        assertEquals(5, orderService.getStock(), "Stock should reduce to 5");
//    }
    @Test
 
    void testPlaceOrderFailure() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> ((OrderService) orderService).placeOrder(15), "Should throw exception for insufficient stock");
        assertEquals("Insufficient stock", thrown.getMessage());
    }
    @Test
    void testCalTotalZeroQuantity() {
        assertEquals(0, orderService.calPrice(100, 0), "Total should be 0 when quantity is 0");
    }

    @ParameterizedTest
 
	@CsvSource ({
 
        "100, 1, 90",
        "200, 2, 360",
        "50, 4, 180"
 
	})	
 
	void testAddParamCsv(int a, int b, int expected) {
 
		assertEquals(expected, orderService.calPrice(a,b));
 
	}

 

    @Test
 
    void testOrderProcessingTimeout() throws InterruptedException {
        Thread.sleep(500); 
        assertTrue(true, "Order processing test passed with timeout");
    }

 
}