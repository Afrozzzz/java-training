package Junit;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
 
class CalculatorTest {
 
	@Test
	void testAdd() {
		Calculator calc =new Calculator();
		assertEquals(10, calc.add(5,5));
	}
 
	@Test
	void testSub() {
		Calculator calc =new Calculator();
		assertEquals(5,calc.sub(10,5));
	}
@Test
void testCondition() {
	Calculator calc =new Calculator();
	assertTrue(calc.add(2,9)>0);
}
@Test
void testConditionf() {
	Calculator calc =new Calculator();
	assertFalse(calc.add(2,9)<0);
}
 
@Test
void testNull() {
	Calculator calc =new Calculator();
	assertNull(calc.add(null,null));
}
@Test
void testNotNull() {
	Calculator calc =new Calculator();
	assertNotNull(calc.add(2,8));
}
@ParameterizedTest
@ValueSource(ints= {12,13,14,15})
void testAddParam(int num) {
	Calculator calc=new Calculator();
	assertEquals(num+10,calc.add(num,10));
}
 
@ParameterizedTest
@CsvSource({
	"5,7,12",
	"6,6,12",
	"3,6,9",
	"2,4,6"
})
void testAddParamCSv(int a,int b,int expected) {
	Calculator calc=new Calculator();
	assertEquals(expected,calc.add(a, b));
}
//Timeouts for Test
@Test
void testTimeout() {
    Calculator calc = new Calculator();
    // Assert that the code block completes within 1000 milliseconds
    assertTimeout(java.time.Duration.ofMillis(1000), () -> {
        // Simulate a delay of 1500 milliseconds
        Thread.sleep(1500);
        // Perform the addition operation
        calc.add(2, 3);
    });
}
@Test
void testException() {
	Calculator calc=new Calculator();
	ArithmeticException exception=assertThrows(ArithmeticException.class, ()->{
		calc.div(12,6);
	});
}
}