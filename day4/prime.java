import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int n,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
b=1;
c=0;
while(b<=n)
{
if((n%b)==0)
c=c+1;
b++;
}
if(c==2)
System.out.println("Prime number"+n);
else
System.out.println("Not a Prime number"+n);
}
}