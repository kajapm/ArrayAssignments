
public class NumberReverseUsingRecursion {
	public static void main(String[] args) {
		System.out.println(new NumberReverseUsingRecursion().reverse(12345));
	}

	int ans = 0;

	int reverse(int n) {
		if (n < 10) {
			ans = ans * 10 + (n % 10);
			return ans;
		}
		ans = ans * 10 + (n % 10);
		reverse(n / 10);
		return ans;
	}
}
