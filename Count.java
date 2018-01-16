import java.util.*;
class Count
{
public static void main(String ag[])
{ int n,i,d=0;
Scanner x=new Scanner(System.in);
System.out.println("Enter a no");
n=x.nextInt();
while(n!=0)
{
n=n/10;
d++;}
System.out.println(d);}}