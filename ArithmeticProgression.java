import java.util.Arrays;

public class ArithmeticProgression {
	public static void main(String[] args) {
		new ArithmeticProgression().getArrays();
	}

	void getArrays() {
		int[] array = { 0x80000000+1, 0, 0x7fffffff};
		int[][] output = new int[array.length][];
		int count = 1, arrayCount = 0, diff = 0, arrayIndex = 0;
		;
		for (int i = 0; i < array.length - 1; i++) {
			diff = array[i] - array[i + 1];
			arrayIndex = i;
			while (i < array.length - 1 && array[i] - array[i + 1] == diff) {
				count++;
				i++;
			}
			i--;
			if (count >= 3) {
				int[] tempArray = new int[count];
				for (int j = 0; j < count; j++) {
					tempArray[j] = array[arrayIndex++];
				}
				output[arrayCount] = tempArray;
				arrayCount++;
			}
			count = 1;
		}

		for (int i = 0; output[i] != null; i++) {
			System.out.println(Arrays.toString(output[i]));
		}

	}
}
