import java.util.Arrays;

public class BoatCount
{
	 private static int[] person=  {2,2,4,4,3,3,6,6};
	 private static int limit=10;
	    private static int requiredBoats(int[] person,int limit)
	    {
	    	Arrays.sort(person);
	    	int numberOfBoats=0;
	    	for(int i=person.length-1;i>=0;i--)
	    	{
	    		for(int j=person.length-1;j>=0;j--)
	    		{
	    			if(i!=j && person[i]!=limit && person[i]!=0 && person[j]!=limit && person[j]!=0)
		    		{
		    			if(person[i]+person[j]<=limit)
		    			{
		    				person[j]=person[i]+person[j];
		    				person[i]=0;
		    			}
		    			for(int n=0;n<person.length;n++)
	    				{
	    					System.out.print(person[n]+" ");
	    				}
		    			System.out.println("");
		    		}
	    		}
	    	}
	    	
	    	for(int i=0;i<person.length;i++)
	    	{
	    		//System.out.println(person[i]);
	    		if(person[i]>0)
	    		{
	    			numberOfBoats++;
	    		}
	    	}
	        return numberOfBoats;
	    }
	public static void main(String args[])
	{
		System.out.println("Boats :"+requiredBoats(person,limit));
	}
}
