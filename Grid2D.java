public class Grid2D {
	java.util.List<String> list = new java.util.ArrayList<String>();

	public void compination(char letters[][], int i, int j, String word, int index, String w) {
		if (i < 0 || j < 0 || i >= letters.length || j >= letters[0].length)
			return;
		if (word.length() == index) {
			if (!list.contains(w)) {
				list.add(w);
				System.out.println(w);
			}
			return;
		}
		if (word.charAt(index) != letters[i][j])
			return;

		char c = letters[i][j];
		letters[i][j] = ' ';
		compination(letters, i - 1, j - 1, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i - 1, j + 1, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i + 1, j - 1, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i + 1, j + 1, word, index + 1, w + c + "(" + i + "," + j + ")");

		compination(letters, i + 1, j, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i, j + 1, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i - 1, j, word, index + 1, w + c + "(" + i + "," + j + ")");
		compination(letters, i, j - 1, word, index + 1, w + c + "(" + i + "," + j + ")");
		letters[i][j] = c;

	}

	public static void main(String ar[]) {
		char letters[][] = { { 'B', 'N', 'E', 'Y', 'S' }, { 'H', 'E', 'D', 'E', 'S' }, { 'S', 'G', 'N', 'D', 'E' } };
		String word = "DES";
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters[i].length; j++) {
				if (word.charAt(0) == letters[i][j])
					new Grid2D().compination(letters, i, j, word, 0, "");
			}
		}
	}
}