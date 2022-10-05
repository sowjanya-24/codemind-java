import java.util.Scanner;
class Adam
{
    public static void main(String args[])
    {
        int n,s,r1,res1=0,s1,r2,res2=0         ;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=n*n;
        while(n>0)
        {
            r1=n%10;
            res1=res1*10+r1;
            n=n/10;
        }
        s1=res1*res1;
        while(s1>0)
        {
            r2=s1%10;
            res2=res2*10+r2;
            s1=s1/10;
        }
        if(s==res2)
        System.out.println("True");
        else
        System.out.println("False");
    }
}