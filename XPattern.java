package myAssignments;
import java.util.*;
public class XPattern {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word :");
		String input=scan.nextLine();
		
		int length=input.length()-1;
		
		if(input.length()%2==0)
		{
			System.out.println("String length is even, cant print X using this word.");
		}
		else
		{
			for(int i=0;i<input.length();i++)
			{
				for(int j=0;j<input.length();j++)
				{
					if(i==j || length-i==j)
					{
						System.out.print(input.charAt(j));
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}

}
