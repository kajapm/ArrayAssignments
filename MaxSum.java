
public class MaxSum {
	int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int max = 0;

	public static void main(String[] args) {
		new MaxSum().findMax();
	}

	private void findMax() {
		getMaxSum(0, 0, arr[0][0]);
		System.out.println(max);
	}

	void getMaxSum(int i, int j, int sum) {
		if (i == arr.length - 1 || j == arr[i].length - 1) {
			max = sum > max ? sum : max;
		}

		if (i+1 < arr.length)
			getMaxSum(i + 1, j, sum + arr[i+1][j]);
		if (j+1 < arr[i].length)
			getMaxSum(i, j + 1, sum + arr[i][j+1]);

	}
}
