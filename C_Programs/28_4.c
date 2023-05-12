//28 4 without return type & with Arguments
#include<stdio.h>
#include<conio.h>

void area();

void main()
{
	int a=4;
	area(a);
	getch();
}

void area(int x)
{
	float y,pi=3.14;
	y=pi*x*x;
	printf("Area of circle is %f",y);
}
