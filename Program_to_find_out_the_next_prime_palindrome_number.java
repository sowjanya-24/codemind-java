import java.util.Scanner;
class NextPrimePalindrom
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2; i<=(int)Math.sqrt(n); i++)
        {
            if(n%i==0)
              c++;
        }
        if(c==0)
          return true;
        else
          return false;
    }
    public static boolean ispalindrom(int n)
    {
        int temp=n,rev=0,r;
        while(n>0)
        {
          r=n%10;
          rev=rev*10+r;
          n=n/10;
        }
        if(temp==rev)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
     int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(int i=n+1; ; i++)
     {
      if(isprime(i) && ispalindrom(i))
       {
        System.out.println(i);
        break;
       }
      }
     }
    }