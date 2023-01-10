
public class Fibnocci {
	public static void main(String[] args) {
		System.out.println(new Fibnocci().calculate(9));
	}

	int firstNumber = 0, secondNumber = 1;

	int calculate(int n) {
		if (n == 0) {
			return firstNumber;
		}
		int temp = secondNumber;
		secondNumber += firstNumber;
		firstNumber = temp;
		return calculate(--n);
	}
}
