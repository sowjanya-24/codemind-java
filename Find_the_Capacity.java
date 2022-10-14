import java.util.Scanner;
class Capacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int S,T,B;
        S=sc.nextInt();
        T=sc.nextInt();
        B=sc.nextInt();
        int capacity=(2*S*T*B*512)/1024;
        System.out.println(capacity+"KB");
    }
}