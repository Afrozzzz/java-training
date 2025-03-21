package Junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class OrderService2Test {
    private OrderService2 orderService2;
    @BeforeEach
    void setup() {
        orderService2 = new OrderService2();
    }
    @Test
    public void testCalPrice_ValidInputs() {
        double price = 100.00;
        int quantity = 2;
        double expectedPrice = price * quantity * (1 - orderService2.getDiscout());
        assertEquals(expectedPrice, orderService2.calPrice(price, quantity));
    }
    @Test
    public void testPlaceOrderSuccess() {
        assertTrue(orderService2.placeOrder(5), "Order should be placed successfully");
        assertEquals(5, orderService2.getstock(), "Stock = 10 - 5");
    }
    @Test
    public void OrderZeroQuantity() {
        assertEquals(0, orderService2.calPrice(100, 0), "Total price should be 0 when quantity is zero");
    }
 

    @Test
    public void compareStock() {
        assertTrue(orderService2.placeOrder(10), "Stock matched quantity");
        assertEquals(0, orderService2.getstock(), "Stock = 10-10 (0)");
    }
    @Test
    public void JustBelowStock() {
        assertTrue(orderService2.placeOrder(9), "Order should be placed when just below stock limit");
        assertEquals(1, orderService2.getstock(), "Stock = 10 - 9");
    }
// Exceptional Cases
	// place order beyond stock
	// set stock -> -ve stock
	// set discount -> (0-1), 1.5 ->
	// negative price
	// negative quantity	
    @Test
    public void InsufficientStock() {
       int quantity = 12;
        assertThrows(IllegalArgumentException.class, () -> {
            orderService2.placeOrder(quantity);
        });
    }
    //negative stock
    @Test
    public void negativeStock() {
    	int stock = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            orderService2.setStock(stock);
        });
    }
	// set discount -> (0-1), 1.5 ->
    @Test
    public void discountException() {
    	double discount = 1.5;
        assertThrows(IllegalArgumentException.class, () -> {
            orderService2.setDiscount(discount);
        });
    }
	// negative price
    @Test
    public void OrderNegativePrice() {
        double price = -100.00;
        int quantity = 2;
        assertThrows(IllegalArgumentException.class, () -> {
            orderService2.calPrice(price, quantity);
        });
    }
	// negative quantity
    @Test
    public void OrderNegativeQuantity() {
        int quantity = -1;
        assertThrows(IllegalArgumentException.class, () -> {
        	orderService2.placeOrder(quantity);
        });
    }
    @ParameterizedTest
    @CsvSource({
        "100.0, 2, 180.0",
        "50.0, 4, 180.0",
        "200.0, 1, 180.0",
        "10.0, 10, 90.0"
    })
    void testCalPrice(double price, int quantity, double expected) {
        assertEquals(expected, orderService2.calPrice(price, quantity));
    }
 
    @ParameterizedTest
    @CsvSource({
        "1",
        "4",
        "7",
        "10"
    })
    void testValidOrderPlacements(int quantity) {
        assertTrue(orderService2.placeOrder(quantity));
    }
 
    @ParameterizedTest
    @CsvSource({
        "11",
        "13",
        "15"
    })
    void testBoundaryConditionsForPlacingOrders(int quantity) {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> orderService2.placeOrder(quantity), "Should throw exception for placing order beyond stock");
        assertEquals("Insufficient stock", thrown.getMessage());
    }
 
 
    @ParameterizedTest
    @CsvSource({
        "-0.5",
        "1.5",
        "2.0"
    })
    void testInvalidDiscounts(double discount) {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> orderService2.setDiscount(discount), "Should throw exception for setting invalid discount");
        assertEquals("Discount must be between 0 and 1", thrown.getMessage());
    }
 
 
    @ParameterizedTest
    @CsvSource({
        "-5",
        "-10",
        "-15"
    })
    void testInvalidStockValues(int stock) {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> orderService2.setStock(stock), "Should throw exception for setting negative stock");
        assertEquals("Stock cannot be negative", thrown.getMessage());
    }
 
    @ParameterizedTest
    @CsvSource({
        "100.0, -5",
        "100.0, 5",
        "-50.0, -2"
    })
   void testNegativePriceAndQuantity(double price, int quantity) {
       IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
           () -> orderService2.calPrice(price, quantity), "Should throw exception for negative price or quantity");
        assertTrue(thrown.getMessage().equals("price cannot be negative") || thrown.getMessage().equals("quantity cannot be negative"),
            "Should throw exception for negative price or quantity");
    
    }
 
 
}