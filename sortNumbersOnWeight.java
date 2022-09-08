package myAssignments;

public class sortNumbersOnWeight 
{
	public static void main(String args[])
	{
	int[] integerArray= {49,36,8,10,12};
	int[][] finalArray=new int[integerArray.length][2];
	
	for(int i=0;i<integerArray.length;i++)
	{
		int temp=0;
		if(((int)(Math.sqrt(integerArray[i]))*((int)(Math.sqrt(integerArray[i])))==integerArray[i]))
		{
			temp+=5;
		}
		
		if(integerArray[i]%4==0 && integerArray[i]%6==0)
		{
			temp+=4;
		}
		
		if(integerArray[i]%2==0)
		{
			temp+=3;
		}
		
		finalArray[i][0]= integerArray[i];
		finalArray[i][1]= temp;
		
	}
	
	int[] temp=new int[2];
	
	for(int i=0;i<finalArray.length;i++)
	{
		for(int j=1; j<(finalArray.length-i);j++)
		{
			if(finalArray[j-1][1]<finalArray[j][1])
			{
				temp=finalArray[j-1];
				finalArray[j-1]=finalArray[j];
				finalArray[j]=temp;
			}
		}
	}
	
	for(int j=0;j<finalArray.length;j++)
	{
		for(int k=0;k<finalArray[j].length;k++)
		{
			System.out.print(finalArray[j][k]+" ");
		}
		System.out.println("");
	}
	}
		
	
}

