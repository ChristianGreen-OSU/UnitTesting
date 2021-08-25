package osu.cse2123;

public class UnitTesting {
	
	/**
	 * Returns the integer average of two integers.
	 * @param num1
	 * @param num2
	 * @return the integer average of num1 and num2
	 */
	public static int average(int num1, int num2) {
		return (num1 + num2)/2;
	}
	
	/**
	 * Determines if a number is odd
	 * @param num number to check for parity
	 * @return true if num is odd, false if even
	 */
	// had to include negative one as an option for negative odd numbers to register as true
	public static boolean isOdd(int num) {
		return num % 2 == 1 || num % 2 == -1;
	}

	/**
	 * Determines if an array holds all even values
	 * @param value
	 * @param array
	 * @return true if all values in the array are even, false otherwise.
	 */
	//had to fix for loop to include all numbers in array, not just the last one.
	public static boolean allEven(int[] array) {
		int result = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i] % 2 == 0) {
				result++;
			}
		}
		if (result == array.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Determines if a string is a palindrome
	 * @param str string to test
	 * @return true if str is a palindrome, false otherwise
	 */
	//fixed java reading capitalized letters as different from lower case by making String str all upper case before running the for loop
	public static boolean isPalindrome(String str) {
		boolean pal = true;
		int stop = (str.length()-1)/2;
		String strCap = str.toUpperCase();
		for (int i=0; i<stop; i++) {
			int end = str.length()-1-i;
			if (strCap.charAt(i) != strCap.charAt(end)) {
				pal = false;
			}
		}
		return pal;
	}
}
