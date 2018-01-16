import java.util.*;
class Sa
{
public static void main(String ag[])
{
Scanner x=new Scanner(System.in);
int a[]=new int[10];
int i,n,k,sum=0;

System.out.println("enter a no");
n=x.nextInt();
for(i=1;i<=n;i++)
{a[i-1]=i;}
System.out.println("enter k");
k=x.nextInt();
if(k<=n){
for(i=1;i<=k;i++)
{
sum=sum+a[i-1];}
System.out.println(sum);}}}