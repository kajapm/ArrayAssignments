

import java.util.Arrays;
import java.util.Scanner;

public class RightSideTraingle {
private Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		RightSideTraingle rightSideTraingle=new RightSideTraingle();
		rightSideTraingle.operation();

	}

	private void operation() {
	int value=scanner.nextInt();
	int[][] arr=new int[value][value];
	int rowUpper=0;
	int columnUpper=0;
	int rowDowner=arr.length-1;
	int columnDowner=arr.length-1;
    int start=0;
	int values=1;
	while(rowUpper<rowDowner||columnUpper<columnDowner) {
		int j=0;
	for(int i=columnUpper;i<=rowDowner;i++) {
		    if(values>15) {break;}
		    arr[start+j][i]=values;
		    values++;
		    j++;
		    System.out.println(values);
			}
		
    rowDowner--;
    if(rowUpper>=rowDowner||columnUpper>=columnDowner) {
		break;
	}
    //down to up
	for(int i=rowDowner;i>=rowUpper;i--) {
		 if(values>15) {break;}
			arr[i][columnDowner]=values;
			values++;
			 System.out.println(values);
	} 
	rowUpper++;
	columnDowner--;
	
	for(int i=columnDowner;i>=rowUpper;i--) {
		 if(values>15) {break;}
		arr[columnUpper][i]=values;
		values++;
		 System.out.println(values);
	}
	columnUpper+=2;
	start+=1;
	System.out.println(rowUpper+" "+rowDowner);
	}
	
	  for(int[] j:arr) {
		  System.out.println(Arrays.toString(j));
	  }
	}

}