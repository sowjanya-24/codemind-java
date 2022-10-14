import java.util.Scanner;
class Circular
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2; i<=(int)Math.sqrt(n); i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static int reverse(int n)
    {
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(!isprime(n))
        System.out.println("not prime");
        else if(isprime(reverse(n)))
        System.out.println("circular prime");
        else
        System.out.println("prime but not a circular prime");
    }
}