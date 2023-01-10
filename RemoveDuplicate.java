import java.util.*;
class RemoveDuplicate 
    {
    
    public static void main(String args[]) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter Array length");
    int arrayLength=scan.nextInt();

    ArrayList<Integer> list =new ArrayList<Integer>();
    for(int i=1; i<=arrayLength;i++)
    {
        System.out.println("Enter "+i+" Array Element :");
        list.add(scan.nextInt());
    }
    for(int i=0; i<list.size();i++)
    {
        for (int j=0;j<list.size();j++)
        {
            if(i!=j)
            {
                if((list.get(i)^list.get(j))==0)
                {
                    list.remove(list.get(j));
                }
            }
        }
    }

    System.out.println(list);
    }
    }
