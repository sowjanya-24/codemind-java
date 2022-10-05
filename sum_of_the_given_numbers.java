import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int T;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int i=0; i<T; i++)
        {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x+y);
        }
    }
}