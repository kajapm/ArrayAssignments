
public class BaseN {
	public static void main(String[] args) {
		new BaseN().getBase();
	}

	void getBase() {
		int n = 123;
		int n2 = 13;
		int base = 4;
		int remainder = 0;
		String ans = "";

		while (n > 0 || n2 > 0) {
			int sum = (n % 10) + (n2 % 10) + remainder;
			remainder = sum / base;
			ans = (sum % base) + ans;
			n /= 10;
			n2 /= 10;
		}

		System.out.println(ans);
	}
}
