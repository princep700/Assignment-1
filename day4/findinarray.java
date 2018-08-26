import java.io.*;

class findinarray
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,n,a=0;
System.out.print("Enter the size of the array : ");
n=Integer.parseInt(input.readLine());
int arr[]=new int[n];
System.out.println("Enter the array : ");
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(input.readLine());
}
System.out.print("Enter Element to find : ");
int x;
x=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
{
if(arr[i]==x)
{
System.out.println("Element Found");
a++;
break;
}
}
if(a==0)
System.out.println("Element not found");
}
}