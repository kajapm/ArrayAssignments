
public class FibnocciSeries {
	public static void main(String[] args) {
		new FibnocciSeries().printSeries(0, 1, 250);
	}

	void printSeries(int start, int second, int limit) {
		if (limit < start) {
			return;
		}
		System.out.print(start + " ");
		printSeries(second, start + second, limit);
	}
}
