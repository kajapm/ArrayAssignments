import java.util.Scanner;

public class PattetrnPrint {
	public static void main(String[] args) {
		new DiagonalPattern().print();
	}
}

class DiagonalPattern {
	private Scanner scanner = new Scanner(System.in);

	void print() {
		String input = scanner.nextLine();
		int length = input.length();
		int mid = length / 2;

		for (int i = 0; i <= mid; i++) {
			for (int j = 0; j < length; j++) {
				if (j == mid + i || j == mid - i)
					System.out.print(input.charAt(j)+" ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		for(int i=mid-1;i>=0;i--)
		{
			for (int j = 0; j < length; j++) {
				if (j == mid + i || j == mid - i)
					System.out.print(input.charAt(j)+" ");
				else 
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
