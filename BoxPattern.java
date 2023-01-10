import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) {
		new BoxPattern().print();
	}

	Scanner scanner = new Scanner(System.in);

	void print() {
		System.out.println("Enter number :");
		int n = scanner.nextInt();
		int startIndex = 0;
		int endIndex = (n * 2) - 2;
		int[][] arr = new int[endIndex + 1][endIndex + 1];
		while (n > 0) {
			for (int i = startIndex; i <= endIndex; i++) {
				for (int j = startIndex; j <= endIndex; j++) {
					arr[i][j] = i == startIndex | i == endIndex | j == startIndex | j == endIndex ? n : arr[i][j];
				}
			}
			n--;
			startIndex++;
			endIndex--;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int element = arr[i][j];
				System.out.print(element + " ");
			}
			System.out.println("");
		}
	}
}
