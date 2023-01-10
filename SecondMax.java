import java.util.Arrays;

public class SecondMax {
	public static void main(String[] args) {
		new SecondMax().returnSecondMax();
	}

	int[] arr = { 1, 2, 3, 4, 5, 6 };

	void returnSecondMax() {
		for (int i = 0; i < arr.length; i++, i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (arr[i + 1] > arr[j]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
