
public class SumRecursion {

	public static void main(String[] args) {
		System.out.println(new SumRecursion().sum(123));
	}

	int sum(int n) {
		if (n == 0)
			return 0;
		return sum(n / 10) + n % 10;
	}
}