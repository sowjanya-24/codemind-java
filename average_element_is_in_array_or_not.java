import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,av=1,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for( i=0;i<n;i++)
        x[i]=sc.nextInt();
        for( i=0; i<n; i++)
        {
           sum=sum+x[i];
           av=sum/n;
        if(av==i)
        {
            System.out.println("True");
            break;
        }
        else
        {
            System.out.println("False");
            break;
        }
        }
    }
}