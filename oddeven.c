#include<stdio.h>
void main()
{
	int n;
	printf("enter a number between 1 and 100000 both inclusive");
	scanf("%d",&n);
	if (n>0)
	printf("Positive");
	else if (n<0)
	printf("Negative");
	else printf("Zero");
}
