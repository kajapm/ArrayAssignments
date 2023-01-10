
public class NearestAverageNumber {
	public static void main(String[] args) {
		new NearestAverageNumber().getNearestAverage();
	}

	int[] arr = { 1,8,2,10 };

	void getNearestAverage() {
		int average = 0;
		int output = arr[0];
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		average = average / arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - average) < Math.abs(output - average)) {
				output = arr[i];
			}
		}
		System.out.println(output);
	}

}
