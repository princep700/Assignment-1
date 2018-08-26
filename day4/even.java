import java.util.Scanner;
class even
{
public static void main(String args[])
{
double a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
a=sc.nextDouble();
if(a%2==0)
{
System.out.println("Yes, the number entered is an even number");
}
else
{
System.out.println("No, the number entered is not an even number");
}
}
}

