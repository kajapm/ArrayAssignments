import java.util.Scanner;

public class BetweenXAndY {
	public static void main(String[] args) {
		new FindElement().print();
	}
}

class FindElement {
	private Scanner scanner = new Scanner(System.in);

	void print() {
		boolean firstValue = true;
		System.out.print("Enter X value :");
		int x = scanner.nextInt();
		System.out.print("Enter Y value :");
		int y = scanner.nextInt();
		System.out.print("Enter array size :");
		int[] inputArray = new int[scanner.nextInt()];

		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > x && inputArray[i] < y) {
				if (firstValue)
				{
					System.out.print(inputArray[i]);
					firstValue=false;
				}
				else
					System.out.print(", " + inputArray[i]);
			}
		}
	}
}
