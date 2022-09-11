import java.util.Scanner;
class Primeinrange
{
 public static boolean isprime(int n)
 {
  int count=0;
  for(int i=2; i<=(int)Math.sqrt(n); i++)
  {
   if(n%i==0)
     count++;
  }
  if(count==0)
    return true;
  else
    return false;
 }
 public static void main(String args[])
 {
  int a,b,c=0;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  if(a==1)
    a=2;
  for(int i=a; i<=b; i++)
  {
   if (isprime(i))
       c++;
  }
  System.out.println(c);
 }
}