
public class FindWords {
	public static void main(String[] args) {
		new FindWords().findWord();
	}

	char[][] arr = { { 'e', 'f', 'd', 'n' }, { 'f', 's', 'e', 'm' }, { 'e', 's', 'r', 'y' } };
	String s = "des";

	void findWord() {
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == s.charAt(0)) {
					output=track(i, j, 0, output+ "(" + arr[i][j] + " " + i + "," + j + ")");
					break;
				}
			}
		}
		System.out.println(output);
	}

	String track(int i, int j, int index, String output) {
		if (index == s.length()-1) {
			return output;
		}

		if (i + 1 < arr.length && s.charAt(index + 1) == arr[i + 1][j])
			return track(i + 1, j, index + 1, output + "(" + arr[i+1][j] + " " + i + "," + j + ")");
		if (i - 1 >= 0 && s.charAt(index + 1) == arr[i - 1][j])
			return track(i - 1, j, index + 1, output + "(" + arr[i-1][j] + " " + i + "," + j + ")");
		if (j + 1 < arr[i].length && s.charAt(index + 1) == arr[i][j + 1])
			return track(i, j + 1, index + 1, output + "(" + arr[i][j+1] + " " + i + "," + j + ")");
		if (j - 1 >= 0 && s.charAt(index + 1) == arr[i][j - 1])
			return track(i, j - 1, index + 1, output + "(" + arr[i][j-1] + " " + i + "," + j + ")");

		return output;
	}
}
