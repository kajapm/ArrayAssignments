import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(new Recursion().reverse());
	}
}
class Recursion
{
	private Scanner scanner=new Scanner(System.in);
	String[] array=scanner.nextLine().split(" ");
	int index=array.length-1;
	String output;
	String reverse()
	{
		if(index==0)
		return array[index];
		return array[index--]+" "+reverse();
	}
}


