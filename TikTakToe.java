import java.util.Arrays;
import java.util.Scanner;

public class TikTakToe {
	public static void main(String[] args) {
		TikTakToeController tttc = new TikTakToeController();
		tttc.play();
	}
}

class TikTakToeController {
	private Scanner scanner = new Scanner(System.in);
	private String[] xAndOs = new String[9];

	void play() {
		Arrays.fill(xAndOs, " ");
		for (int i = 0; i < 9; i++) {
			printBoxes();
			if (!isWin()) {
				if (i % 2 == 0) {
					System.out.println("\nEnter X index :");
					int n = Integer.parseInt(scanner.nextLine())-1;
					if (xAndOs[n] == "X" | xAndOs[n] == "O") {
						System.out.print("\nAlready entered,select another.!");
						i--;
					} else {
						xAndOs[n] = "X";
					}
				} else {
					System.out.println("\nEnter O index :");
					int n = Integer.parseInt(scanner.nextLine())-1;
					if (xAndOs[n] == "X" | xAndOs[n] == "O") {
						System.out.println("\nAlready entered,select another.!");
						i--;
					} else {
						xAndOs[n] = "O";
					}
				}
			} else
				break;
		}
		printBoxes();
		if (!isWin())
			System.out.println("\nMatch Draw.!");
		System.out.println("\n Want to play another match :\n1.yes\n2.No");
		String option = scanner.nextLine();
		if (option.equals("1"))
			play();
		else
			System.out.println("\nThank You !");
	}

	boolean isWin() {
		String elements = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				elements = xAndOs[0] + xAndOs[1] + xAndOs[2];
				break;
			case 1:
				elements = xAndOs[3] + xAndOs[4] + xAndOs[5];
				break;
			case 2:
				elements = xAndOs[6] + xAndOs[7] + xAndOs[8];
				break;
			case 3:
				elements = xAndOs[0] + xAndOs[3] + xAndOs[6];
				break;
			case 4:
				elements = xAndOs[1] + xAndOs[4] + xAndOs[7];
				break;
			case 5:
				elements = xAndOs[2] + xAndOs[5] + xAndOs[8];
				break;
			case 6:
				elements = xAndOs[0] + xAndOs[4] + xAndOs[8];
				break;
			case 7:
				elements = xAndOs[2] + xAndOs[4] + xAndOs[6];
				break;
			}

			if (elements.equals("XXX")) {
				System.out.println("\nX Wins");
				return true;
			} else if (elements.equals("OOO")) {
				System.out.println("\nO Wins");
				return true;
			}
		}
		return false;
	}

	void printBoxes() {
		System.out.println("\n|---|---|---|");
		System.out.println("| " + xAndOs[0] + " | " + xAndOs[1] + " | " + xAndOs[2] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + xAndOs[3] + " | " + xAndOs[4] + " | " + xAndOs[5] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + xAndOs[6] + " | " + xAndOs[7] + " | " + xAndOs[8] + " |");
		System.out.println("|---|---|---|");

	}
}
