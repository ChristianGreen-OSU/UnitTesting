import static org.junit.jupiter.api.Assertions.*;
import osu.cse2123.UnitTesting;
import org.junit.jupiter.api.Test;
/**
 * Testing AllEven Method
 * 
 * @author ChristianBarrett
 * @version 01282021

Test Plan
evenArray     result               reason
---------  ------------ -----------------------------
    2         true                 Even
    1         false                 Odd
    0         true                 Zero 
{1,1,2}       false              Even ending <<This test causes a failure. The only number that matters in the array for the method is the last one.
   -3         true                neg. Odd 
   -6         false               neg. Even 
 */
class AllEvenTest {

	@Test
	void testAllEvenEven() {
		int[]  evenArray = new int[] {2};
		boolean truth = true;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"Even");
	}
	@Test
	void testAllEvenOdd() {
		int[]  evenArray = new int[] {1};
		boolean truth = false;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"Odd");
	}
	@Test
	void testAllEvenZero() {
		int[]  evenArray = new int[] {0};
		boolean truth = true;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"Zero");
	}
	
	//This test causes a failure
	@Test
	void testAllEvenEndEven() {
		int[]  evenArray = new int[] {1, 1, 2};
		boolean truth = false;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"The end is even");
	}
	@Test
	void testAllEvenNegOdd() {
		int[]  evenArray = new int[] {-3};
		boolean truth = false;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"Neg. Odd");
	}
	@Test
	void testAllEvenNegEven() {
		int[]  evenArray = new int[] {-6};
		boolean truth = true;
		boolean test = UnitTesting.allEven(evenArray);
		assertEquals(truth,test,"Neg. Even");
	}

}
