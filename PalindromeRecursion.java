
public class PalindromeRecursion {
	public static void main(String[] args) {
		System.out.println(new PalindromeRecursion().isPalindrome(0, 4, "abcde"));
	}

	boolean isPalindrome(int start, int end, String s) {
		if (start >= end)
			return true;
		return s.charAt(start) == s.charAt(end) && isPalindrome(++start, --end, s);
	}
}
