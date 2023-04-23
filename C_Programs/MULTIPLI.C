//Check they are multiple or not
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2;
	printf("enter the first integer =");
	scanf("%d",num1);
	printf("enter the second integer =");
	scanf("%d",num2);
	if(num1%num2==0)
	{
	printf("%d is a multiple",num2);
	}
	else if(num2%num1==0)
	{
	printf("%d is a multiple",num1);
	}
	getch();
}