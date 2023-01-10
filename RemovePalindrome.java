import java.util.Scanner;

public class RemovePalindrome {
	public static void main(String[] args) {
		NoPalindrome noPalindrome=new NoPalindrome();
		System.out.println(noPalindrome.removePalindrome());
	}
}

class NoPalindrome
{
	private Scanner scanner=new Scanner(System.in);
	String string=scanner.nextLine();
	StringBuilder sb;
	
	public String removePalindrome()
	{
		String[] arr=string.split(" ");
		string="";
		for(int i=0;i<arr.length;i++)
		{
			sb=new StringBuilder(arr[i]);
			String reversed=sb.reverse().toString();
			if(!reversed.equals(arr[i]))
			{
				string+=arr[i]+" ";
			}
		}
		return string;
	}
}