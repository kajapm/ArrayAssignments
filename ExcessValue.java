import java.util.Arrays;

public class ExcessValue {
	public static void main(String[] args) {
		new ExcessValue().getExcess();
	}

	int[] array = { 39, 121, 12, 23, 8 };

	void getExcess() {
		int excessValue = 0;
		for (int i = 0; i < array.length; i++) {
			int value = array[i] + excessValue;
			int j = 1;
			while (value >= j * 2) {
				j *= 2;
			}
			excessValue = value - j;
			array[i] = j;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("excess : " + excessValue);
	}
}
