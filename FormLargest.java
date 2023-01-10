public class FormLargest {
	public static void main(String[] args) {
		new FormLargest().findLargest();
	}

	int[] inputArray = { 87, 66, 9, 7, 8 };
	int n = 7;

	void findLargest() {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				Double firstPossible = Double.parseDouble(inputArray[i] + "" + inputArray[j]);
				Double secondPossible = Double.parseDouble(inputArray[j] + "" + inputArray[i]);
				if (secondPossible > firstPossible) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		System.out.println(findMaxArray());
	}

	int findMaxArray() {
		int max = 0;
		for (int i = 0; i < inputArray.length; i++) {
			String elements = inputArray[i] + "";
			for (int j = 0; j < inputArray.length; j++) {
				if (elements.length() == n && Integer.parseInt(elements) > max) {
					max = Integer.parseInt(elements);
				}
				if (i != j && (elements + inputArray[j]).length() <= n) {
					elements += inputArray[j];
					if (elements.length() == n && Integer.parseInt(elements) > max) {
						max = Integer.parseInt(elements);
					}
				}
			}
		}
		return max;
	}
}
