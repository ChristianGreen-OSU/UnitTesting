import static org.junit.jupiter.api.Assertions.*;
import osu.cse2123.UnitTesting;
import org.junit.jupiter.api.Test;
/**
 * Testing isPalindrome Method
 * 
 * @author ChristianBarrett
 * @version 01282021

Test Plan
Palindrome     result               reason
---------  ------------ -----------------------------
   Cac         true        Different capitalization  <<this causes an error because java reads capitalized letters as different from lower cased ones. Fixed by first converting string to upper case.
  kayak        true             Palindrome
  KAYAK        true         All Caps Palindrome
  fjdks        false            not a palindrome
    G         true                One Letter
 */
class IsPalindromeTest {

	//This test causes an error
	@Test
	void testIsPalindromeYesCapitalization() {
		String Palindrome = "Cac";
		boolean truth = true;
		boolean test = UnitTesting.isPalindrome(Palindrome);
		assertEquals(truth,test,"Cac");
	}
	@Test
	void testIsPalindromeYes() {
		String Palindrome = "kayak";
		boolean truth = true;
		boolean test = UnitTesting.isPalindrome(Palindrome);
		assertEquals(truth,test,"kayak");
	}
	@Test
	void testIsPalindromeYesAllCaps() {
		String Palindrome = "KAYAK";
		boolean truth = true;
		boolean test = UnitTesting.isPalindrome(Palindrome);
		assertEquals(truth,test,"KAYAK");
	}
	@Test
	void testIsPalindromeNotPalindrome() {
		String Palindrome = "fjdks";
		boolean truth = false;
		boolean test = UnitTesting.isPalindrome(Palindrome);
		assertEquals(truth,test,"fjdks");
	}
	@Test
	void testIsPalindromeOneLetter() {
		String Palindrome = "G";
		boolean truth = true;
		boolean test = UnitTesting.isPalindrome(Palindrome);
		assertEquals(truth,test,"G");
	}
}
