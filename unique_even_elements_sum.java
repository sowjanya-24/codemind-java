import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(int i=0; i<n; i++)
        {
          if(x[i]!=-999)
          {
              for(int j=0; j<n; j++)
              {
                  if(x[i]==x[j]&&i!=j)
                  {
                      x[j]=-999;
                  }
              }
              if(x[i]%2==0)
              {
                  sum=sum+x[i];
              }
          }
        }
        System.out.println(sum);
    }
}