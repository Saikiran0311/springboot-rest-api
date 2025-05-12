package spring.junitAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("MathUtils Test Suite")
public class MathUtilsTest {

	MathUtils mathUtils = new MathUtils();

	@Nested
	@DisplayName("Math Operations")
	@Tag("unit")
	class MathTests {

		@Test
		@DisplayName("Testing for addtion")
		void testAdd() {
			assertEquals(100.0, mathUtils.add(70, 30));
			assertEquals(4.0, mathUtils.add(-3, 7));
			assertEquals(20.0, mathUtils.add(7, 13));
		}
		
		@Test
		@DisplayName("Testing for Multiplication")
		void testProduct() {
			assertEquals(-10.0, mathUtils.multiply(-2, 5));
			assertEquals(30.0, mathUtils.multiply(10, 3));
			assertEquals(26.0, mathUtils.multiply(2, 13));
		}
		
		@Test
		@DisplayName("Testing for Division")
		void testDivision() {
			assertEquals(10.0, mathUtils.divide(70, 7));
			assertEquals(25.0, mathUtils.divide(50, 2));
			assertEquals(7.0, mathUtils.divide(49, 7));
		}
		
		@Test
		@DisplayName("Should throw exception for Zero input")
		void testZeroDivison() {
			assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(5,0));
		}

	}
}
