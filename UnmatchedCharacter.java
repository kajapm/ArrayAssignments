
public class UnmatchedCharacter {
	public static void main(String[] args) {
		new UnmatchedCharacter().getUnmatched();
	}

	char[] string1 = "abcdefghijk".toCharArray();
	char[] string2 = "abcdehjkikk".toCharArray();

	void getUnmatched() {
		int stringLength = string1.length;
		String output = "";
		for (int i = 0; i < stringLength; i++) {
			if (string1[i] != string2[i]) {
				output += string1[i];
				output += string2[i];
			}
		}
		System.out.println(output);
	}
}
