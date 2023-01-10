import java.util.Arrays;

public class PowerOfElement {
	public static void main(String[] args) {
		new PowerOfElement().getPower();
	}

	int[] arr = { -2, 1, 3, 4, 5 };
	int power = 2;

	void getPower() {
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			int answer = 1;
			for (int j = 0; j < power; j++) {
				answer *= element;
			}
			arr[i] = answer;
		}
		System.out.println(Arrays.toString(arr));
	}
}
