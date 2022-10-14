import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        int count=0;
        int flag=0;
        for(int i=0; i<n; i++)
        {
            count=1;
            if(x[i]!=99)
            {
                for(int j=0; j<n; j++)
                {
                    if(x[i]==x[j]&&i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
                if(x[i]==count)
                {
                    System.out.print(x[i]+" ");
                     flag=1;
                }
            }
        }
        if(flag==0)
       System.out.println("-1");
    }
}