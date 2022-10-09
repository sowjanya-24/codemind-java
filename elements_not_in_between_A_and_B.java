import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,count=0,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(x[i]<a||b<x[i])
            {
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}