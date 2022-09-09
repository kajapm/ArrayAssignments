import java.util.*;
class MatrixMultiplication 
{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first array row :");
        int firstArrayRow=scan.nextInt();
        System.out.println("Enter first array column :");
        int firstArrayColumn=scan.nextInt();

        int[][] firstArray=new int[firstArrayRow][firstArrayColumn];

        for(int i=1;i<=firstArrayRow;i++)
        {
            for (int j=1;j<=firstArrayColumn;j++)
            {
                System.out.println("First Array's "+i+" row "+j+" column number :");
                firstArray[i-1][j-1]=scan.nextInt();
            }
        }

        System.out.println("Enter second array row :");
        int secondArrayRow=scan.nextInt();
        System.out.println("Enter second array column :");
        int secondArrayColumn=scan.nextInt();

        int[][] secondArray=new int[secondArrayRow][secondArrayColumn];

        for(int i=1;i<=secondArrayRow;i++)
        {
            for (int j=1;j<=secondArrayColumn;j++)
            {
                System.out.println("Second array's "+i+" row "+j+" column number :");
                secondArray[i-1][j-1]=scan.nextInt();
            }
        }

        int[][] finalArray=new int[firstArrayRow][secondArrayColumn];

        if(firstArrayColumn!=secondArrayRow)
        {
            System.out.println(firstArrayRow+"x"+firstArrayColumn+" dimension array can't be multiply by "+secondArrayRow+"x"+secondArrayColumn+" dimension array.");
        }
        else
        {
            for(int i=0;i<firstArrayRow;i++)
            {
                for(int j=0;j<secondArrayColumn;j++)
                {
                    for(int k=0;k<firstArrayColumn;k++)
                    {
                        finalArray[i][j]+=firstArray[i][k]*secondArray[k][j];
                    }
                }
            }
        }

        for(int i=0;i<finalArray.length;i++)
        {
            for(int j=0;j<finalArray[i].length;j++)
            {
                System.out.print(finalArray[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
