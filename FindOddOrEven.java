import java.util.*;
class FindOddOrEven
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Input :");
        int input=scan.nextInt();

        if((input&1) == 1)
        {
            System.out.println("Input is Odd.");
        }
        else
        {
            System.out.println("Input is Even.");
        }

        
    }
}
