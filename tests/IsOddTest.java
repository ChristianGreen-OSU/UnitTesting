import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import osu.cse2123.UnitTesting;
/**
 * Testing IsOdd Method
 * 
 * @author ChristianBarrett
 * @version 01282021

Test Plan
   num1       result               reason
---------  ------------ -----------------------------
    2         false                 Even
    0         false               Testing 0's
    1         true                  Odd 
2147483647    true            Odd upper limit
   -3         true                neg. Odd << This test causes a failure, using modulo gives a negative 1 but method only has '== positive 1'. Included '== -1' to fix.
   -6         false               neg. Even 
-2147483647   true		      Odd lower limit

 */
class IsOddTest {

	@Test
	void testisOddEven() {
		int num1 = 2;
		boolean truth = false;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Even");
	}
	@Test
	void testisOddZero() {
		int num1 = 0;
		boolean truth = false;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Zero");
	}
	@Test
	void testisOddOdd() {
		int num1 = 1;
		boolean truth = true;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Odd");
	}
	@Test
	void testisOddOddUpperLimit() {
		int num1 = 2147483647;
		boolean truth = true;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Odd Upper Limit");
	}
	
	//This test causes a failure
	@Test
	void testisOddNegOdd() {
		int num1 = -3;
		boolean truth = true;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Negative Odd");
	}
	@Test
	void testisOddNegEven() {
		int num1 = -6;
		boolean truth = false;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Negative Even");
	}
	void testisOddOddLowerLimit() {
		int num1 = -2147483647;
		boolean truth = true;
		boolean test = UnitTesting.isOdd(num1);
		assertEquals(truth,test,"Odd Lower Limit");
	}

}
