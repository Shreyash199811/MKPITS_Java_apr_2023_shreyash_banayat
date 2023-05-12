// 28 2 no return type & no arguments
#include<stdio.h>
#include<conio.h>

void maximum()
{
	int num1,num2,max;
	printf("Enter the first number=");
	scanf("%d",&num1);
	printf("Enter the second number=");
	scanf("%d",&num2);
	
	if(num1>num2){
		printf("first number is greater than second number.");
	}else
	{
		printf("second number is greater than first number.");
	}
}

int main()
{
	maximum();
	getch();
}
