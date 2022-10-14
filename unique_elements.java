import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(x[i]!=-99)
            {
                for(int j=0; j<n; j++)
                {
                    if(x[i]==x[j]&&i!=j)
                    {
                        x[j]=-99;
                    }
                }
                System.out.print(x[i]+" ");
            }
        }
    }
}