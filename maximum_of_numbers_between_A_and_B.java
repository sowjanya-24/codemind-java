import java.util.Scanner;
class Maximumbetween
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,max=0,a,b;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(x[i]>=a&&x[i]<=b)
            {
                count++;
                max=x[0];
                if(x[i]>max)
                max=x[i];
            }
        }
        if(count==0)
        System.out.println("-1");
        else
        System.out.println(max);
    }
}