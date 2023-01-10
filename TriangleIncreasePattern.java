
public class TriangleIncreasePattern {
	public static void main(String[] args) {
		new TriangleIncreasePattern().print();
	}

	void print() {
		int n = 6;
		for (int i = 0; i < n; i++) {
			int number = i + 1;
			for (int j = 0; j < n - i; j++) {
				System.out.print(number + " ");
				number = number + (n - j);
			}
			System.out.println();
		}
	}
}
