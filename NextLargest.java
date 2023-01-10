
public class NextLargest {
	public static void main(String[] args) {
		new NextLargest().print();
	}

	int[] arr = { 4, 3, 7, 8, 3, 4, 1 };

	void print() {
		boolean hasNextLargest = false;
		for (int i = 0; i < arr.length; i++) {
			int nextLargest = 0x7fffffff;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[j] > arr[i]) {
					nextLargest = Math.min(arr[j], nextLargest);
					hasNextLargest = true;
				}
			}
			if (hasNextLargest) {
				System.out.println(arr[i] + "->" + nextLargest + " ");
				hasNextLargest = false;
			} else
				System.out.println(arr[i] + "->" );
		}
	}
}
