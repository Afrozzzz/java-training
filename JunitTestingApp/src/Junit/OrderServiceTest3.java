package Junit;
 
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
 
public class OrderServiceTest3 {
 
    private OrderService orderService;
 
    @BeforeAll
    public static void initAll() {
        System.out.println("Starting all tests...");
    }
 
    @BeforeEach
    public void setUp() {
        orderService = new OrderService();
        System.out.println("Setting up for a test...");
    }
 
    @Test
    void testInsufficientStock() {
        assertThrows(IllegalArgumentException.class, () -> {
            orderService.placeOrder(15);
        });
    }
 
    @Test
    void testCalculateTotalPrice() {
        double price = 100.0;
        int quantity = 5;
        double expectedTotal = price * quantity * (1 - OrderService.getDiscount());
        assertEquals(expectedTotal, orderService.calPrice(price, quantity));
    }
 
    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testDisabled() {
        // This test will be skipped
    }
 
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after a test...");
    }
 
    @AfterAll
    public static void tearDownAll() {
        System.out.println("All tests completed.");
    }
}