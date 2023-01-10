
public class BinaryAddition {
	public static void main(String[] args) {
		new BinaryAddition().add();
	}

	void add() {
		int firstBinary = 1010;
		int secondBinary = 11001;
		int remainder = 0;
		String result = "";

		while (firstBinary > 0 || secondBinary > 0 || remainder>0) {
			int sumOfLastDigit = (firstBinary % 10) + (secondBinary % 10) + remainder;
			if (sumOfLastDigit < 2) {
				result = sumOfLastDigit + result;
				remainder = 0;
			} else if (sumOfLastDigit == 2) {
				result = 0 + result;
				remainder = 1;
			} else if (sumOfLastDigit == 3) {
				result = 1 + result;
				remainder = 1;
			}
			firstBinary /= 10;
			secondBinary /= 10;
		}
		System.out.println(result);
	}
}
