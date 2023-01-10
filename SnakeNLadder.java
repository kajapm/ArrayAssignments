import java.util.Scanner;

public class SnakeNLadder {
	public static void main(String[] args) {
		SnakeNLadder snakeNLadder = new SnakeNLadder();
		snakeNLadder.play();
	}

	Scanner scanner = new Scanner(System.in);
	int[] board = new int[100];
	int player1 = 0;
	int player2 = 0;

	void addSnakesNLadders() {
		board[5] = 23;
		board[20] = 40;
		board[10] = 21;
		board[55] = 80;
		board[30] = 68;
		board[79] = 96;

		board[99] = 72;
		board[91] = 84;
		board[75] = 23;
		board[60] = 45;
		board[42] = 27;
		board[25] = 7;
	}

	void play() {
		addSnakesNLadders();
		while (player1 != 99 && player2 != 99) {
			System.out.print("\nPress enter to dice : ");
			scanner.nextLine();
			int diceValue = (int) Math.ceil(Math.random() * 6);
			System.out.println("Dice value : " + diceValue + "\n");
			player1 = changePosition(diceValue, player1);

			printBoard();

			System.out.print("\nPress enter for computer play : ");
			scanner.nextLine();
			diceValue = (int) Math.ceil(Math.random() * 6);
			System.out.println("Computer dice value : " + diceValue + "\n");
			player2 = changePosition(diceValue, player2);

			printBoard();
		}

		if (player1 == 99) {
			System.out.println("\nPlayer wins");
		} else {
			System.out.println("\nComputer Wins");
		}
	}

	int changePosition(int diceValue, int player) {
		if (diceValue + player < 100) {
			player = player + diceValue;

			if (board[player] > 0)
				return board[player];
			return player;
		}
		return player;
	}

	void printBoard() {
		for (int i = 99; i >= 0; i -= 20) {
			for (int j = i; j > i - 10; j--) {
				if (j == player1 && j == player2) {
					System.out.print("|" + (j + 1) + "p1 " + "p2");
				} else if (j == player1) {
					System.out.print("|" + (j + 1) + "\t" + "p1");
				} else if (j == player2) {
					System.out.print("|" + (j + 1) + "\t" + "p2");
				} else {
					System.out.print("|" + (j + 1) + "\t" + "  ");
				}
			}
			System.out
					.print("|\n-----------------------------------------------------------------------------------\n");
			for (int j = i - 19; j <= i - 10; j++) {
				if (j == player1 && j == player2) {
					System.out.print("|" + (j + 1) + " p1 " + "p2");
				} else if (j == player1) {
					System.out.print("|" + (j + 1) + "\t" + "p1");
				} else if (j == player2) {
					System.out.print("|" + (j + 1) + "\t" + "p2");
				} else {
					System.out.print("|" + (j + 1) + "\t" + "  ");
				}
			}
			System.out
					.print("|\n-----------------------------------------------------------------------------------\n");
		}
	}
}
