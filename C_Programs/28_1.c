//28 1 no return type and no argument
#include<stdio.h>
#include<conio.h>
void Addition()
{
	int num1,num2,sum;
	printf("Enter the first number=");
	scanf("%d",&num1);
	printf("Enter the second number=");
	scanf("%d",&num2);
	sum=num1+num2;
	printf("The addition of two numbers is %d",sum);
}
void main()
{
	clrscr();
	Addition();
	getch();
}
