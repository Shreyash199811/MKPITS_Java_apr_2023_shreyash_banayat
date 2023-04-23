//Divide first no. by second
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2;
	printf("Enter the two numbers=");
	scanf("%d%d",&num1,&num2);
	if(num2==0)
	{
	printf("Division is not possible");
	}
	else
	{
	printf("Division is possible");
	}
	getch();
}