import java.util.Scanner;

public class LongestPrefix {
	public static void main(String[] args) {
		FindLongest fl = new FindLongest();
		fl.longestCommonPrefix();
	}
}

class FindLongest {
	private Scanner scanner = new Scanner(System.in);

	public void longestCommonPrefix() {
		String[] array = new String[Integer.parseInt(scanner.nextLine())];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextLine();
		}
		String outputString = "";
		boolean flag = false;
		int stringLength = array[0].length();
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() < stringLength) {

				stringLength = array[i].length();

			}
		}

		for (int i = 0; i < stringLength; i++) {
			char tempChar = (array[0]).charAt(i);
			for (int j = 0; j < array.length; j++) {
				flag = false;
				if (array[j].length() > i) {
					if ((array[j]).charAt(i) == tempChar) {
						flag = true;
					} else {
						flag = false;
						break;
					}
					if (flag == false) {
						break;
					}
				}
			}
			if (flag == true) {
				outputString = outputString + String.valueOf((array[0]).charAt(i));
			}

			else {
				break;
			}

		}

		System.out.println(outputString);

	}
}
