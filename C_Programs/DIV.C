//Division of two numbers
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	float num1,num2;
	float division;
	printf("Enter any number other than 0 =");
	scanf("%f",&num1);
	printf("Enter any number other than 0 =");
	scanf("%f",&num2);
	division=num1/num2;
	printf("The division is %f",division);
	getch();
}