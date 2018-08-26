import java.io.*;

class sort
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,j,s,n;
System.out.print("Enter the size of the array : ");
n=Integer.parseInt(input.readLine());
int arr[]=new int[n];
System.out.println("Enter the array : ");
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(input.readLine());
}
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if(arr[j]>arr[j+1])
{
s=arr[j];
arr[j]=arr[j+1];
arr[j+1]=s;
}
}
}
System.out.println("Sorted Array : ");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}