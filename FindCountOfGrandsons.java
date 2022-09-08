package myAssignments;
import java.util.*;
public class FindCountOfGrandsons 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter whose grandson count you need :");
		String grandPaa=scan.nextLine();
		scan.close();
		String dad=null;
		int grandsonCount=0;
		
		String[][] childAndParent= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		
		for(int i=0;i<childAndParent.length;i++)
		{
			if(childAndParent[i][1].equals(grandPaa))
			{
				dad=childAndParent[i][0];
				
				for(int j=0;j<childAndParent.length;j++)
				{
					if(childAndParent[j][1].equals(dad))
					{
						grandsonCount++;
					}
				}
			}
		}
		
		System.out.println(grandPaa +"'s grandsons count are : "+grandsonCount);
	}

}
