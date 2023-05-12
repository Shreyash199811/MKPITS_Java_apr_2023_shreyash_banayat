//28 2 No return type & with arguments
#include<stdio.h>
#include<conio.h>

void maximum(int num1,int num2)
{
	int max;
	if(num1>num2){
	printf("first number is greater than second number.");
	}else
	{
	printf("second number is greater than first number.");
	}
}

void main()
{
	clrscr();
	int x,y;
	printf("Enter the value of x & y=");
	scanf("%d%d",&x,&y);
	maximum(x,y);
	getch();
}
