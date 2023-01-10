import java.util.*;
public class SwapTwoValues 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int firstNumber=scan.nextInt();
        System.out.println("Enter the second Number :");
        int secondNumber=scan.nextInt();

        firstNumber=firstNumber^secondNumber;
        secondNumber=firstNumber^secondNumber;
        firstNumber=firstNumber^secondNumber;

        System.out.println("First Number ="+firstNumber);
        System.out.println("Second Number ="+secondNumber);

    }
}
