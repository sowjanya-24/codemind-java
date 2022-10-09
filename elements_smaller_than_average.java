import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0,count=0;
        float aver;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(i=0; i<n; i++)
        {
            sum=sum+x[i];
        }
        aver=sum/n;
        for(i=0; i<n; i++)
        {
            if(x[i]<=aver)
            count++;
        }
        System.out.println(count);
    }
}