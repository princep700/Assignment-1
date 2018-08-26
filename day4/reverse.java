import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int n,rev=0;
System.out.println("Enter the number you want to reverse:");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
rev=rev*10+(n%10);
n=n/10;
}
System.out.println("Your number is reversed:"+rev);
}
}