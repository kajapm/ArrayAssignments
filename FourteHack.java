import java.util.Scanner;

class FourteHack
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter first Number :");
        int n1=scan.nextInt();
        System.out.print("Enter second Number :");
        int n2=scan.nextInt();
        System.out.print("Enter third Number :");
        int n3=scan.nextInt();
        System.out.print("Enter fourth Number :");
        int n4=scan.nextInt();
        System.out.print("Enter target Number :");
        int target=scan.nextInt();

        char[] operators={'+','-','*'};
        int[] integers={n1,n2,n3,n4};

        int iLoop=0;
        int jLoop=0;
        int kLoop=0;

       for(int i=0;i<3;i++)
       {
            if(i==0)
            {
                iLoop=(n1+n2);
            }
            else if(i==1)
            {
                iLoop=(n1-n2);
            }

            else if(i==2)
            {
                iLoop=(n1*n2);
            }
            for(int j=0;j<3;j++)
            {
                if(j==0)
                {
                    jLoop=iLoop+n3;
                }
               else if(j==1)
                {
                    jLoop=iLoop-n3;
                }

                else if(j==2)
                {
                    jLoop=iLoop*n3;
                }
                for(int k=0;k<3;k++)
                {
                    if(k==0)
                    {
                        if(jLoop+n4==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n4);
                        }
                    }
                    else if(k==1)
                    {
                        if(jLoop-n4==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n4);
                        }
                    }
                    else if(k==2)
                    {
                        if(jLoop*n4==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n4);
                        }
                    }
                }
            }
       }

       for(int i=0;i<3;i++)
       {
            if(i==0)
            {
                iLoop=(n4+n3);
            }
            else if(i==1)
            {
                iLoop=(n4-n3);
            }

            else if(i==2)
            {
                iLoop=(n4*n3);
            }
            for(int j=0;j<3;j++)
            {
                if(j==0)
                {
                    jLoop=iLoop+n2;
                }
               else if(j==1)
                {
                    jLoop=iLoop-n2;
                }

                else if(j==2)
                {
                    jLoop=iLoop*n2;
                }
                for(int k=0;k<3;k++)
                {
                    if(k==0)
                    {
                        if(jLoop+n1==target)
                        {
                            System.out.println(n4+""+(operators[i])+""+n3+(operators[j])+""+n2+(operators[k])+""+n1);
                        }
                    }
                    else if(k==1)
                    {
                        if(jLoop-n1==target)
                        {
                            System.out.println(n4+""+(operators[i])+""+n3+(operators[j])+""+n2+(operators[k])+""+n1);
                        }
                    }
                    else if(k==2)
                    {
                        if(jLoop*n1==target)
                        {
                            System.out.println(n4+""+(operators[i])+""+n3+(operators[j])+""+n2+(operators[k])+""+n1);
                        }
                    }
                }
            } 
       }

       for(int i=0;i<3;i++)
       {
            if(i==0)
            {
                iLoop=(n4+n2);
            }
            else if(i==1)
            {
                iLoop=(n4-n2);
            }

            else if(i==2)
            {
                iLoop=(n4*n2);
            }
            for(int j=0;j<3;j++)
            {
                if(j==0)
                {
                    jLoop=iLoop+n3;
                }
               else if(j==1)
                {
                    jLoop=iLoop-n3;
                }

                else if(j==2)
                {
                    jLoop=iLoop*n3;
                }
                for(int k=0;k<3;k++)
                {
                    if(k==0)
                    {
                        if(jLoop+n1==target)
                        {
                            System.out.println(n4+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n1);
                        }
                    }
                    else if(k==1)
                    {
                        if(jLoop-n1==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n1);
                        }
                    }
                    else if(k==2)
                    {
                        if(jLoop*n1==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n2+(operators[j])+""+n3+(operators[k])+""+n1);
                        }
                    }
                }
            }
       }

       for(int i=0;i<3;i++)
       {
            if(i==0)
            {
                iLoop=(n1+n4);
            }
            else if(i==1)
            {
                iLoop=(n1-n4);
            }

            else if(i==2)
            {
                iLoop=(n1*n4);
            }
            for(int j=0;j<3;j++)
            {
                if(j==0)
                {
                    jLoop=iLoop+n3;
                }
               else if(j==1)
                {
                    jLoop=iLoop-n3;
                }

                else if(j==2)
                {
                    jLoop=iLoop*n3;
                }
                for(int k=0;k<3;k++)
                {
                    if(k==0)
                    {
                        if(jLoop+n2==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n4+(operators[j])+""+n3+(operators[k])+""+n2);
                        }
                    }
                    else if(k==1)
                    {
                        if(jLoop-n2==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n4+(operators[j])+""+n3+(operators[k])+""+n2);
                        }
                    }
                    else if(k==2)
                    {
                        if(jLoop*n2==target)
                        {
                            System.out.println(n1+""+(operators[i])+""+n4+(operators[j])+""+n3+(operators[k])+""+n2);
                        }
                    }
                }
            }
       }

       iLoop=0;
       jLoop=0;

       for(int i=0;i<1;i++)
       {
            for(int j=2;j<4;j++)
            {
                
                if(i==0 && j==2)
                {
                    iLoop=Integer.parseInt(String.valueOf(integers[i])+String.valueOf(integers[j]));
                    jLoop=Integer.parseInt(String.valueOf(integers[i+1])+String.valueOf(integers[j+1]));
                }

                else if(i==1 && j==2)
                {
                    iLoop=Integer.parseInt(String.valueOf(integers[i])+String.valueOf(integers[j]));
                    jLoop=Integer.parseInt(String.valueOf(integers[i-1])+String.valueOf(integers[j+1]));
                }

                else if(i==0 && j==3)
                {
                    iLoop=Integer.parseInt(String.valueOf(integers[i])+String.valueOf(integers[j]));
                    jLoop=Integer.parseInt(String.valueOf(integers[i+1])+String.valueOf(integers[j-1]));
                }

                else if(i==1 && j==3)
                {
                    iLoop=Integer.parseInt(String.valueOf(integers[i])+String.valueOf(integers[j]));
                    jLoop=Integer.parseInt(String.valueOf(integers[i-1])+String.valueOf(integers[j-1]));
                }
               
                    
                    
                if(iLoop+jLoop==target)
                {
                    System.out.println(iLoop+"+"+jLoop);
                }

                if(iLoop-jLoop==target)
                {
                    System.out.println(iLoop+"-"+jLoop);
                }

                if(iLoop*jLoop==target)
                {
                    System.out.println(iLoop+"*"+jLoop);
                }   
            }
       } 
    }
}
