//two numbers in pairs are in ascending or decending order
#include<stdio.h>
#include<conio.h>
void main()
{
	int num1,num2;
	printf("\nEnter any two numbers =");
	scanf("%d%d",&num1,&num2);
	if(num1>num2)
	{
	printf("The two numbers are in Descending order");
	}
	else
	{
	printf("The two numbers are in Ascending order");
	}
	getch();
}