import java.util.Scanner;
class Averageprime
{
    public static boolean isprime(int n)
    {
        if(n<2)
        return false;
        int c=0;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(isprime(x[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}