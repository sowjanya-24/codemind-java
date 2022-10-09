import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=(int)Math.sqrt(n);
        if(n==(s*(s+1)))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}