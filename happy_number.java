import java.util.Scanner;
class Happyno
{
    public static int happy(int n)
    {
        int sum=0,r=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=n;
        while(result!=1&&result!=4)
        {
            result=happy(result);
        }
        if(result==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}