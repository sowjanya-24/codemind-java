import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        for(int i=0; i<k; i++)
        {
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}