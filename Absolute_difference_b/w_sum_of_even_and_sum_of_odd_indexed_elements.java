import java.util.Scanner;
class Absolute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],even=0,odd=0,d;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            even=even+x[i];
        }
        for(int i=0; i<n; i++)
        {
            if(i%2!=0)
            odd=odd+x[i];
        }
        d=Math.abs(even-odd);
        System.out.println(d);
    }
}