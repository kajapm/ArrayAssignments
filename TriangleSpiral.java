import java.util.Scanner;

public class TriangleSpiral {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int element = 1;
		int downIndex = 0;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n/2; i++) {
			for (int j = i; i + j < n; j++) {
				arr[j][i + j] = element++;
				downIndex = j;
			}
			for (int j = downIndex - 1; j >= i; j--) {
				arr[j][(n - 1) - i] = element++;
			}
			for (int j = (n-1) - i; j >= i; j--) {
				arr[i][j] = element++;
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
