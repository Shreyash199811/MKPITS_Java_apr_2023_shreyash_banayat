#include<stdio.h >
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2,result;
	printf("Enter any two numbers");
	scanf("%d%d",&num1,&num2);
	result=num1*num2;
	printf("Result of multiplication is %d",result);
	getch();
}