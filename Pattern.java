import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		SnakePattern sp=new SnakePattern();
		sp.print();
	}
}

class SnakePattern {
	private Scanner scanner = new Scanner(System.in);

	void print() {
		int row = scanner.nextInt();
		int number1 = 0, number2 = 0;
		for (int i = 0; i < row; i = i + 2) {
			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < row; j++) {
				System.out.print(++number1 + " ");
			}
			System.out.println("");
			number2 = number1 + row;
			for (int j = i + 1; j < row; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < row && i + 1 < row; j++) {
				System.out.print(number2-- + " ");
			}
			System.out.println("");
			number1 = number2 + row;
		}
	}
}
