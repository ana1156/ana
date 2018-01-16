import java.util.Scanner;
public class Leap
{
public static void main(String ag[])
{
int y;
Scanner x=new Scanner(System.in);
System.out.println("Enter year");
y=x.nextInt();
if((y%4==0)||(y%400==0&&y%100!=0))
System.out.println("leap year");
else 
System.out.println("not a leap year");
}}
