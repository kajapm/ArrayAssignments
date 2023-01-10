public class OddPattern {
	public static void main(String[] args) {
		new OddPattern().print(6);
	}

	void print(int n) {
		int num = 2;
		int m = 1;
		int printer = 0;
		System.out.println(1);
		for (int i = 1; i < n; i++) {
			printer = num;
			for (int j = 0; j <= i; j++) {
				System.out.print(printer + " ");
				printer += 2;
			}
			System.out.println();
			i++;
			num += m;
			printer = num;
			if (i < n) {
				for (int j = 0; j <= i; j++) {
					System.out.print(printer + " ");
					printer += 2;
				}
			}
			m += 2;
			num += m;
			System.out.println("");
		}
	}
}
