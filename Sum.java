import java.util.Scanner;
public class Sum
{
public static void main(String ag[])
{
int n,i,sum=0;
Scanner x=new Scanner(System.in);
System.out.println("enter n");
n=x.nextInt();
for(i=1;i<=n;i++)
{sum=sum+i;
}
System.out.println(sum);}}