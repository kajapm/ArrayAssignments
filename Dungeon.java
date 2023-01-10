import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dungeon {
	public static void main(String[] args) {
		new GameProcess().play();
	}
}

class GameProcess {
	Scanner scanner = new Scanner(System.in);
	int adventurerRow, adventurerColumn, monsterRow, monsterColumn, goldRow, goldColumn, monsterMove;
	String[][] gameField;
	private ArrayList<String> list = new ArrayList<String>();

	void getInputs() {
		try {
			System.out.print("Row and column with comma seperated :");
			String[] matrixRowAnColumn = scanner.nextLine().split(",");
			String[][] matrix = new String[Integer.parseInt(matrixRowAnColumn[0])][Integer
					.parseInt(matrixRowAnColumn[1])];
			for (String[] arr : matrix) {
				Arrays.fill(arr, " ");
			}
			gameField = matrix;

			System.out.println("Adventurer row and column with comma seperated :");
			String[] adventurerRowAndColumn = scanner.nextLine().split(",");
			adventurerRow = Integer.parseInt(adventurerRowAndColumn[0]) - 1;
			adventurerColumn = Integer.parseInt(adventurerRowAndColumn[1]) - 1;
			gameField[adventurerRow][adventurerColumn] = "A";

			System.out.println("Monster row and column with comma seperated :");
			String[] monsterRowAndColumn = scanner.nextLine().split(",");
			monsterRow = Integer.parseInt(monsterRowAndColumn[0]) - 1;
			monsterColumn = Integer.parseInt(monsterRowAndColumn[1]) - 1;
			gameField[monsterRow][monsterColumn] = "M";

			System.out.println("Gold row and column with comma seperated :");
			String[] goldRowAndColumn = scanner.nextLine().split(",");
			goldRow = Integer.parseInt(goldRowAndColumn[0]) - 1;
			goldColumn = Integer.parseInt(goldRowAndColumn[1]) - 1;
			gameField[goldRow][goldColumn] = "G";

			System.out.println("Enter number of pit :");
			int numberOfPits = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < numberOfPits; i++) {
				System.out.println("Pit " + (i + 1) + " row and column with comma seperated :");
				String[] pitIndex = scanner.nextLine().split(",");
				gameField[Integer.parseInt(pitIndex[0]) - 1][Integer.parseInt(pitIndex[1]) - 1] = "P";
			}
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("inputWrong.!");
			System.out.println(e.toString());
			getInputs();
		}
	}

	void track(int adventurerRow, int adventurerColumn, int goldRow, int goldColumn, String path) {

		if (adventurerRow == goldRow && adventurerColumn == goldColumn) {
			path += "(" + (adventurerRow + 1) + "," + (adventurerColumn + 1) + ")";
			list.add(path);
			return;
		}

		if (adventurerRow < 0 || adventurerColumn < 0 || adventurerRow >= gameField.length
				|| adventurerColumn >= gameField[0].length || gameField[adventurerRow][adventurerColumn].equals("P")
				|| gameField[adventurerRow][adventurerColumn].equals(""))
			return;

		String n=gameField[adventurerRow][adventurerColumn];
		gameField[adventurerRow][adventurerColumn]="";
		
		track(adventurerRow + 1, adventurerColumn, goldRow, goldColumn,
				path + "(" + (adventurerRow + 1) + "," + (adventurerColumn + 1) + ")");
		track(adventurerRow, adventurerColumn + 1, goldRow, goldColumn,
				path + "(" + (adventurerRow + 1) + "," + (adventurerColumn + 1) + ")");
		track(adventurerRow - 1, adventurerColumn, goldRow, goldColumn,
				path + "(" + (adventurerRow + 1) + "," + (adventurerColumn + 1) + ")");
		track(adventurerRow, adventurerColumn - 1, goldRow, goldColumn,
				path + "(" + (adventurerRow + 1) + "," + (adventurerColumn + 1) + ")");
		
		gameField[adventurerRow][adventurerColumn]=n;
	}

	void play() {
		getInputs();
		monsterMove = Math.abs(monsterRow - goldRow);
		monsterMove += Math.abs(monsterColumn - goldColumn);
		String path = "";
		
		track(adventurerRow, adventurerColumn, goldRow, goldColumn, path);
		String min = list.get(0);
		for (String s : list) {
			if (s.length() < min.length())
				min = s;
		}
		System.out.println(min + " " + (min.length() / 5 - 1));
	}
}