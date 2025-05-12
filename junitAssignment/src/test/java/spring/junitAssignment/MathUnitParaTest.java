package spring.junitAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("MathUtils Test Suite")
public class MathUnitParaTest {

	MathUtils mathUtils = new MathUtils();

	@Nested
	@DisplayName("Math Operations")
	@Tag("unit")
	class MathTests {

        @ParameterizedTest(name = "add({0}, {1}) = {2}")
        @CsvSource({
            "70, 30, 100.0",
            "7, 3, 10.0",
            "7, 13, 20.0",
            "-7, -3, -10.0",
            "7, -3, 4.0",
            "-9, 3, -6.0"
        })
        @DisplayName("Testing addition with multiple cases")
        void testAdd(int a, int b, double sum) {
            assertEquals(sum, mathUtils.add(a, b));
        }
		
        @ParameterizedTest(name = "multiply({0}, {1}) = {2}")
        @CsvSource({
            "2, 5, 10.0",
            "10, 3, 30.0",
            "2, 13, 26.0",
            "-2, 5, -10.0",
            "10, -3, -30.0",
            "-5, -3, 15.0"
        })
		@DisplayName("Testing for Multiplication")
        void testProduct(int a, int b, double sum) {
            assertEquals(sum, mathUtils.multiply(a, b));
        }
		
        @ParameterizedTest(name = "divide({0}, {1}) = {2}")
        @CsvSource({
            "70, 7, 10.0",
            "50, 2, 25.0",
            "49, 7, 7.0"
        })
		@DisplayName("Testing for Division")
		void testDivision(int a, int b, double div) {
            assertEquals(div, mathUtils.divide(a, b));
		}
		
        @ParameterizedTest(name = "Should throw exception for divide({0}, {1})")
        @CsvSource({
            "0, 0",
            "5, 0",
            "-10, 0"
        })
		@DisplayName("Should throw exception for Zero input")
		void testZeroDivison(int a, int b) {
            assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(a, b));
		}

	}
}
