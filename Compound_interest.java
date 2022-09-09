import java.util.Scanner;
class Compound
{
    public static void main(String args[])
    {
        int p,t,r;
        double a;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        a=p*Math.pow(1+(float)r/100.0,t);
        System.out.format("%.2f",a);
    }
}