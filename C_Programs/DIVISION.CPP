#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2,result;
	printf("Enter the first number=");
	scanf("%d",&num1);
	printf("Enter any  number other than 0 =");
	scanf("%d",&num2);
	result=num1/num2;
	printf("Result=%d",result);
	getch();
}