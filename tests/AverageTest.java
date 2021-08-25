import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import osu.cse2123.UnitTesting;
/**
 * Testing average method
 * 
 * @author ChristianBarrett
 * @version 01252021

Test Plan
   num1       num2       result               reason
--------- ----------- ------------ -----------------------------
    2          1            1         Even and Odd combination
    0          0            0               Testing 0's
    1          1            1         Odd and Odd combination
    2          2            2         Even and Even combination
   -3         -1           -2        2 negatives w/ neg. result
   -5          1           -2         1 negative w/ neg. result 
   -1          5		    2		  1 negative w/ pos. result
2147483647 2147483647  2147483647        Really Big Numbers      <This causes a failure b/c result is at upper limit of int range
 */
class AverageTest {

	@Test
	void testAverageEvenandOdd() {
		int num1 = 2;
		int num2 = 1;
		int truth = 1;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"Even and Odd");
	}
	@Test
	void testAverageBothZero() {
		int num1 = 0;
		int num2 = 0;
		int truth = 0;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"Both Zero");
	}
	@Test
	void testAverageOddandOdd() {
		int num1 = 1;
		int num2 = 1;
		int truth = 1;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"Odd and Odd");
	}
	@Test
	void testAverageEvenandEven() {
		int num1 = 2;
		int num2 = 2;
		int truth = 2;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"Even and Even");
	}
	@Test
	void testAverageTwoNegativesNegativeResult() {
		int num1 = -3;
		int num2 = -1;
		int truth = -2;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"2 negatives and a negative result");
	}
	@Test
	//This test causes a failure
	void testAverageOneNegativeNegativeResult() {
		int num1 = -3;
		int num2 = 1;
		int truth = -1;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"1 negative and a negative result");
	}
	@Test
	void testAverageOneNegativePositiveResult() {
		int num1 = -1;
		int num2 = 5;
		int truth = 2;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"1 negative and a positive result");
	}
	@Test
	void testAverageReallyBigNumbersResult() {
		int num1 = 2147483647;
		int num2 = 2147483647;
		int truth = 2147483647;
		int test = UnitTesting.average(num1, num2);
		assertEquals(truth,test,"2 numbers at the upper limit of int class type");
	}
	
}
