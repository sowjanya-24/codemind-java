import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(i=1; i<n-i; i++)
        {
            if(x[i-1]%2==0&&x[i+1]%2!=0||x[i-1]%2!=0&&x[i+1]%2==0)
            count++;
            if(x[n-1]%2==0&&x[i]%2!=0||x[n-1]%2!=0&&x[i]%2==0)
            count++;
            if(x[n-2]%2==0&&x[0]%2!=0||x[n-2]%2!=0&&x[0]%2==0)
            count++;
        }
        System.out.println(count);
    }
}