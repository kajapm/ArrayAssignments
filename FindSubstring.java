import java.util.Scanner;

public class FindSubstring {
	public static void main(String[] args) {
		new SubString().findIndex();
	}
}

class SubString{
	private Scanner scanner = new Scanner(System.in);
	void findIndex()
	{
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();
		
		System.out.println(string1.indexOf(string2));
	}
}
