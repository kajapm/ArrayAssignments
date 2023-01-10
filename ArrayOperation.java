import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
	public static void main(String[] args) {
		SetNextBigger setNextBigger = new SetNextBigger();
		setNextBigger.arrange();
	}
}

class SetNextBigger {
	private Scanner scanner = new Scanner(System.in);

	public void arrange() {
		System.out.print("No of elements :");
		int index = 0;
		int[] inputArray = new int[scanner.nextInt()];
		int[] outputArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			int n = scanner.nextInt();
			inputArray[i] = n;
			outputArray[i] = n;
		}
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				if (outputArray[i] == inputArray[j]) {
					index = j;
				}
			}
			if (index != inputArray.length - 1) {
				outputArray[i] = inputArray[index + 1];
			} else
				outputArray[i] = inputArray[index];
		}

		System.out.println(Arrays.toString(outputArray));
	}
}