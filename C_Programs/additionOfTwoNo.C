/*******************************************
Statement - Print Hello World
Programmer - Vineet Choudhary
Written For - http://developerinsider.in
********************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
	clrscr();
	int num1,num2,result;
	printf("Enter two number for addition=\n");
	scanf("%d%d",&num1,&num2);
	result=num1+num2;
	printf("The addition of these two numbers is %d",result);
	getch();
}
