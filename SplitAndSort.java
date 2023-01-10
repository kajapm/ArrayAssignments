import java.util.Arrays;

public class SplitAndSort {
	public static void main(String[] args) {
		new SplitAndSort().sort();
	}

	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int splitIndex = 5;

	void sort() {
		for (int i = 0; i < array.length; i = i + splitIndex) {
			int startIndex = i;
			int endIndex;
			if (startIndex + splitIndex < array.length)
				endIndex = startIndex + splitIndex - 1;
			else
				endIndex = array.length - 1;
			while (endIndex > startIndex && startIndex < array.length) {
				int temp = array[startIndex];
				array[startIndex] = array[endIndex];
				array[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
