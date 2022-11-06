import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,i,k;
        n=sc.nextInt();
        x=new int[n];
        for( i=0;i<n;i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        for( i=0; i<n; i++)
        {
           if(x[i]==k)
           count++;
        }
        
        System.out.println(count);
    }
}