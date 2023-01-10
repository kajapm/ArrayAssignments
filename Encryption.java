import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		new Encrypt().encrypt();
	}
}

class Encrypt {
	private Scanner scanner = new Scanner(System.in);

	void encrypt() {
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		String output = "";

		for (int i = 0; i < string1.length(); i++) {
			int ascii = ((int) string1.charAt(i) - 96) + ((int) string2.charAt(i) - 96);
			if (ascii > 26) {
				ascii -= 26;
			}
			output += (char) (ascii + 96);
		}
		System.out.println(output);
	}
}
