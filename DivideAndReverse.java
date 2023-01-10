
public class DivideAndReverse {
	public static void main(String[] args) {
		DivideAndReverse dr = new DivideAndReverse();
		dr.reverse(0);
		dr.reverse(8);
		dr.reverse(0,4);
		dr.reverse(3,7);
	}

	String input = "Hello world";
	String output = "";

	void reverse(int startIndex) {
		input += '\0';
		output="";
		for (int i = 0; i < startIndex; i++) {
			output += input.charAt(i);
		}
		String reverse = "";
		for (int i = startIndex; input.charAt(i) != '\0'; i++) {
			reverse = input.charAt(i) + reverse;
		}
		System.out.println(output + reverse);
	}

	void reverse(int startIndex, int endIndex) {
		input += '\0';
		output="";
		String reverse = "";
		for (int i = 0; input.charAt(i) != '\0'; i++) {
			if (i == startIndex) {
				for (; i < endIndex; i++) {
					reverse = input.charAt(i) + reverse;
				}
				output += reverse;
				i--;
			} else {
				output += input.charAt(i);
			}
		}
		System.out.println(output);
	}
}
